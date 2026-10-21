// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetIncidentInvestigationResponseBody extends TeaModel {
    /**
     * <p>The AI investigation details of the incident. This field is empty if no matching investigation record is found.</p>
     */
    @NameInMap("IncidentInvestigation")
    public GetIncidentInvestigationResponseBodyIncidentInvestigation incidentInvestigation;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this call.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIncidentInvestigationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentInvestigationResponseBody self = new GetIncidentInvestigationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentInvestigationResponseBody setIncidentInvestigation(GetIncidentInvestigationResponseBodyIncidentInvestigation incidentInvestigation) {
        this.incidentInvestigation = incidentInvestigation;
        return this;
    }
    public GetIncidentInvestigationResponseBodyIncidentInvestigation getIncidentInvestigation() {
        return this.incidentInvestigation;
    }

    public GetIncidentInvestigationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIncidentInvestigationResponseBodyIncidentInvestigation extends TeaModel {
        /**
         * <p>The name of the alert that triggered this AI investigation.</p>
         * 
         * <strong>example:</strong>
         * <p>Webshell Alert</p>
         */
        @NameInMap("IncidentInvestigationAlertName")
        public String incidentInvestigationAlertName;

        /**
         * <p>The judgment conclusion of the AI investigation, corresponding to ai_judgement_conclusion in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient evidence to confirm whether the attack chain is complete. Supplement correlated logs for further analysis</p>
         */
        @NameInMap("IncidentInvestigationConclusion")
        public String incidentInvestigationConclusion;

        /**
         * <p>The display ID of the AI investigation report. You can use this value as the IncidentInvestigationDisplayId parameter of this operation to query the report.</p>
         * 
         * <strong>example:</strong>
         * <p>755616bb5d63046c1e4f62ea872a****</p>
         */
        @NameInMap("IncidentInvestigationDisplayId")
        public String incidentInvestigationDisplayId;

        /**
         * <p>The end time of the AI investigation, in seconds (UNIX timestamp). If the execution end time is not recorded, the last update time of the investigation record is used. This field is empty if neither time exists.</p>
         * 
         * <strong>example:</strong>
         * <p>1786195753</p>
         */
        @NameInMap("IncidentInvestigationEndTime")
        public Long incidentInvestigationEndTime;

        /**
         * <p>The unique ID of the AI investigation report. You can use this value as the IncidentInvestigationId parameter of this operation to query the report.</p>
         * 
         * <strong>example:</strong>
         * <p>951a6a0b-14c7-4332-ace6-bff21c******</p>
         */
        @NameInMap("IncidentInvestigationId")
        public String incidentInvestigationId;

        /**
         * <p>The output content of the AI investigation, in JSON-formatted string. This field can contain fields such as investigation_report (the investigation process and evidence body, which may use Markdown format). This field is empty if the corresponding output is not generated. Internal fields may change across report versions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;investigation_report&quot;:&quot;### Investigation Results\nSuspicious file detected, but execution evidence is missing.&quot;}</p>
         */
        @NameInMap("IncidentInvestigationOutput")
        public String incidentInvestigationOutput;

        /**
         * <p>The AI investigation report content, in JSON-formatted string. This field can contain fields such as judgement_category (judgment category), ai_judgement_conclusion (judgment conclusion), ai_summary (summary), attack process, and attack graph. The specific content may change across report versions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;judgement_category&quot;:&quot;insufficient_information_to_evaluate&quot;,&quot;ai_judgement_conclusion&quot;:&quot;Insufficient evidence to confirm whether the attack chain is complete. Supplement correlated logs for further analysis.&quot;,&quot;ai_summary&quot;:&quot;Suspicious file detected. Insufficient evidence to confirm whether the attack was successful.&quot;}</p>
         */
        @NameInMap("IncidentInvestigationReport")
        public String incidentInvestigationReport;

        /**
         * <p>The start time of the AI investigation, in seconds (UNIX timestamp). If the execution start time is not recorded, the creation time of the investigation record is used. This field is empty if neither time exists.</p>
         * 
         * <strong>example:</strong>
         * <p>1786195533</p>
         */
        @NameInMap("IncidentInvestigationStartTime")
        public Long incidentInvestigationStartTime;

        /**
         * <p>The judgment category of the AI investigation report, corresponding to judgement_category in the report. This field does not indicate the execution status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li>real_attack: Real attack.</li>
         * <li>blocked: Risk blocked.</li>
         * <li>false_positive: Suspected false positive.</li>
         * <li>insufficient_information_to_evaluate: Unable to determine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>insufficient_information_to_evaluate</p>
         */
        @NameInMap("IncidentInvestigationStatus")
        public String incidentInvestigationStatus;

        /**
         * <p>The summary of the AI investigation report, corresponding to ai_summary in the investigation results.</p>
         * 
         * <strong>example:</strong>
         * <p>Suspicious file detected. Insufficient evidence to confirm whether the attack was successful</p>
         */
        @NameInMap("IncidentInvestigationSummary")
        public String incidentInvestigationSummary;

        /**
         * <p>The globally unique UUID of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>9f00c254391400f6898c4d4fea******</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        public static GetIncidentInvestigationResponseBodyIncidentInvestigation build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentInvestigationResponseBodyIncidentInvestigation self = new GetIncidentInvestigationResponseBodyIncidentInvestigation();
            return TeaModel.build(map, self);
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationAlertName(String incidentInvestigationAlertName) {
            this.incidentInvestigationAlertName = incidentInvestigationAlertName;
            return this;
        }
        public String getIncidentInvestigationAlertName() {
            return this.incidentInvestigationAlertName;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationConclusion(String incidentInvestigationConclusion) {
            this.incidentInvestigationConclusion = incidentInvestigationConclusion;
            return this;
        }
        public String getIncidentInvestigationConclusion() {
            return this.incidentInvestigationConclusion;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationDisplayId(String incidentInvestigationDisplayId) {
            this.incidentInvestigationDisplayId = incidentInvestigationDisplayId;
            return this;
        }
        public String getIncidentInvestigationDisplayId() {
            return this.incidentInvestigationDisplayId;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationEndTime(Long incidentInvestigationEndTime) {
            this.incidentInvestigationEndTime = incidentInvestigationEndTime;
            return this;
        }
        public Long getIncidentInvestigationEndTime() {
            return this.incidentInvestigationEndTime;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationId(String incidentInvestigationId) {
            this.incidentInvestigationId = incidentInvestigationId;
            return this;
        }
        public String getIncidentInvestigationId() {
            return this.incidentInvestigationId;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationOutput(String incidentInvestigationOutput) {
            this.incidentInvestigationOutput = incidentInvestigationOutput;
            return this;
        }
        public String getIncidentInvestigationOutput() {
            return this.incidentInvestigationOutput;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationReport(String incidentInvestigationReport) {
            this.incidentInvestigationReport = incidentInvestigationReport;
            return this;
        }
        public String getIncidentInvestigationReport() {
            return this.incidentInvestigationReport;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationStartTime(Long incidentInvestigationStartTime) {
            this.incidentInvestigationStartTime = incidentInvestigationStartTime;
            return this;
        }
        public Long getIncidentInvestigationStartTime() {
            return this.incidentInvestigationStartTime;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationStatus(String incidentInvestigationStatus) {
            this.incidentInvestigationStatus = incidentInvestigationStatus;
            return this;
        }
        public String getIncidentInvestigationStatus() {
            return this.incidentInvestigationStatus;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentInvestigationSummary(String incidentInvestigationSummary) {
            this.incidentInvestigationSummary = incidentInvestigationSummary;
            return this;
        }
        public String getIncidentInvestigationSummary() {
            return this.incidentInvestigationSummary;
        }

        public GetIncidentInvestigationResponseBodyIncidentInvestigation setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

    }

}
