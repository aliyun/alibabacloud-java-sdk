// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactRisksResponseBody extends TeaModel {
    /**
     * <p>List of artifact risks</p>
     */
    @NameInMap("ArtifactRiskList")
    public java.util.List<ListArtifactRisksResponseBodyArtifactRiskList> artifactRiskList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52919DB1-03A0-55F5-BDD4-DB6DEBB8267A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListArtifactRisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactRisksResponseBody self = new ListArtifactRisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactRisksResponseBody setArtifactRiskList(java.util.List<ListArtifactRisksResponseBodyArtifactRiskList> artifactRiskList) {
        this.artifactRiskList = artifactRiskList;
        return this;
    }
    public java.util.List<ListArtifactRisksResponseBodyArtifactRiskList> getArtifactRiskList() {
        return this.artifactRiskList;
    }

    public ListArtifactRisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListArtifactRisksResponseBodyArtifactRiskList extends TeaModel {
        /**
         * <p>CVE numbers</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2023-4911</p>
         */
        @NameInMap("CveNos")
        public String cveNos;

        /**
         * <p>Extended information, in JSON format, to be parsed according to the risk category</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;feature&quot;: &quot;ntpdate&quot;, 
         *   &quot;version&quot;: &quot;4.2.6&quot;, 
         *   &quot;cveLocation&quot;: &quot;/usr/lib&quot; 
         * }</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>Risk level:</p>
         * <ul>
         * <li>high represents high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Risk name.</p>
         * 
         * <strong>example:</strong>
         * <p>USN-3686-1: file vulnerabilities</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        /**
         * <p>Risk type. Values:</p>
         * <ul>
         * <li>AcrCve  Container image system vulnerability</li>
         * <li>AcrSca  Container image application vulnerability</li>
         * <li>EcsVulnerability  ECS image vulnerability information</li>
         * <li>EcsAlarm  ECS image security alarm</li>
         * <li>EcsBaseline  ECS image baseline check</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AcrCve</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        /**
         * <p>Risk Type name</p>
         * 
         * <strong>example:</strong>
         * <p>Container System Vulner</p>
         */
        @NameInMap("RiskTypeName")
        public String riskTypeName;

        /**
         * <p>Solution for the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>apt-get update &amp;&amp; apt-get install ntpdate --only-upgrade</p>
         */
        @NameInMap("Solution")
        public String solution;

        public static ListArtifactRisksResponseBodyArtifactRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactRisksResponseBodyArtifactRiskList self = new ListArtifactRisksResponseBodyArtifactRiskList();
            return TeaModel.build(map, self);
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setCveNos(String cveNos) {
            this.cveNos = cveNos;
            return this;
        }
        public String getCveNos() {
            return this.cveNos;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setRiskTypeName(String riskTypeName) {
            this.riskTypeName = riskTypeName;
            return this;
        }
        public String getRiskTypeName() {
            return this.riskTypeName;
        }

        public ListArtifactRisksResponseBodyArtifactRiskList setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

    }

}
