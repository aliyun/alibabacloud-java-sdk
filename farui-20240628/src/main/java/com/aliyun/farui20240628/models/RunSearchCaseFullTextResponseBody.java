// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchCaseFullTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RunSearchCaseFullTextResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C844BE6B-33A9-5AC4-A1AE-97B131849E0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RunSearchCaseFullTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSearchCaseFullTextResponseBody self = new RunSearchCaseFullTextResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSearchCaseFullTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunSearchCaseFullTextResponseBody setData(RunSearchCaseFullTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunSearchCaseFullTextResponseBodyData getData() {
        return this.data;
    }

    public RunSearchCaseFullTextResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunSearchCaseFullTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunSearchCaseFullTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSearchCaseFullTextResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt extends TeaModel {
        @NameInMap("city")
        public String city;

        @NameInMap("commonLevel")
        public String commonLevel;

        @NameInMap("country")
        public String country;

        @NameInMap("county")
        public String county;

        @NameInMap("district")
        public String district;

        @NameInMap("name")
        public String name;

        @NameInMap("province")
        public String province;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("specialLevel")
        public String specialLevel;

        public static RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt self = new RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setCommonLevel(String commonLevel) {
            this.commonLevel = commonLevel;
            return this;
        }
        public String getCommonLevel() {
            return this.commonLevel;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setCounty(String county) {
            this.county = county;
            return this;
        }
        public String getCounty() {
            return this.county;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt setSpecialLevel(String specialLevel) {
            this.specialLevel = specialLevel;
            return this;
        }
        public String getSpecialLevel() {
            return this.specialLevel;
        }

    }

    public static class RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain extends TeaModel {
        @NameInMap("abstractObj")
        public String abstractObj;

        @NameInMap("appliedLaws")
        public String appliedLaws;

        @NameInMap("basicCase")
        public String basicCase;

        @NameInMap("caseBasic")
        public String caseBasic;

        @NameInMap("caseCause")
        public String caseCause;

        @NameInMap("caseFeature")
        public String caseFeature;

        @NameInMap("caseId")
        public String caseId;

        @NameInMap("caseNo")
        public String caseNo;

        @NameInMap("caseSummary")
        public String caseSummary;

        @NameInMap("caseTitle")
        public String caseTitle;

        @NameInMap("caseType")
        public String caseType;

        @NameInMap("closeCaseCause")
        public String closeCaseCause;

        @NameInMap("courtFindOut")
        public String courtFindOut;

        @NameInMap("courtThink")
        public String courtThink;

        @NameInMap("dataFrom")
        public String dataFrom;

        @NameInMap("disputeFocus")
        public String disputeFocus;

        @NameInMap("disputeFocusTag")
        public java.util.List<String> disputeFocusTag;

        @NameInMap("disputedpoints")
        public String disputedpoints;

        @NameInMap("documentType")
        public String documentType;

        @NameInMap("judgReason")
        public String judgReason;

        @NameInMap("keyfacts")
        public String keyfacts;

        @NameInMap("legalBasis")
        public String legalBasis;

        @NameInMap("litigants")
        public String litigants;

        @NameInMap("litigationParticipant")
        public String litigationParticipant;

        @NameInMap("openCaseCause")
        public String openCaseCause;

        @NameInMap("preTrialProcess")
        public String preTrialProcess;

        @NameInMap("referLevel")
        public String referLevel;

        @NameInMap("refereeGist")
        public String refereeGist;

        @NameInMap("sourceContent")
        public String sourceContent;

        @NameInMap("trialCourt")
        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt trialCourt;

        /**
         * <strong>example:</strong>
         * <p>2018-09-27</p>
         */
        @NameInMap("trialDate")
        public String trialDate;

        @NameInMap("trialLevel")
        public String trialLevel;

        @NameInMap("trialProcess")
        public String trialProcess;

        @NameInMap("trialProgram")
        public String trialProgram;

        @NameInMap("verdict")
        public String verdict;

        public static RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain self = new RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setAbstractObj(String abstractObj) {
            this.abstractObj = abstractObj;
            return this;
        }
        public String getAbstractObj() {
            return this.abstractObj;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setAppliedLaws(String appliedLaws) {
            this.appliedLaws = appliedLaws;
            return this;
        }
        public String getAppliedLaws() {
            return this.appliedLaws;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setBasicCase(String basicCase) {
            this.basicCase = basicCase;
            return this;
        }
        public String getBasicCase() {
            return this.basicCase;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseBasic(String caseBasic) {
            this.caseBasic = caseBasic;
            return this;
        }
        public String getCaseBasic() {
            return this.caseBasic;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseCause(String caseCause) {
            this.caseCause = caseCause;
            return this;
        }
        public String getCaseCause() {
            return this.caseCause;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseFeature(String caseFeature) {
            this.caseFeature = caseFeature;
            return this;
        }
        public String getCaseFeature() {
            return this.caseFeature;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        public String getCaseId() {
            return this.caseId;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseNo(String caseNo) {
            this.caseNo = caseNo;
            return this;
        }
        public String getCaseNo() {
            return this.caseNo;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseSummary(String caseSummary) {
            this.caseSummary = caseSummary;
            return this;
        }
        public String getCaseSummary() {
            return this.caseSummary;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseTitle(String caseTitle) {
            this.caseTitle = caseTitle;
            return this;
        }
        public String getCaseTitle() {
            return this.caseTitle;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public String getCaseType() {
            return this.caseType;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCloseCaseCause(String closeCaseCause) {
            this.closeCaseCause = closeCaseCause;
            return this;
        }
        public String getCloseCaseCause() {
            return this.closeCaseCause;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCourtFindOut(String courtFindOut) {
            this.courtFindOut = courtFindOut;
            return this;
        }
        public String getCourtFindOut() {
            return this.courtFindOut;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setCourtThink(String courtThink) {
            this.courtThink = courtThink;
            return this;
        }
        public String getCourtThink() {
            return this.courtThink;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setDataFrom(String dataFrom) {
            this.dataFrom = dataFrom;
            return this;
        }
        public String getDataFrom() {
            return this.dataFrom;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setDisputeFocus(String disputeFocus) {
            this.disputeFocus = disputeFocus;
            return this;
        }
        public String getDisputeFocus() {
            return this.disputeFocus;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setDisputeFocusTag(java.util.List<String> disputeFocusTag) {
            this.disputeFocusTag = disputeFocusTag;
            return this;
        }
        public java.util.List<String> getDisputeFocusTag() {
            return this.disputeFocusTag;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setDisputedpoints(String disputedpoints) {
            this.disputedpoints = disputedpoints;
            return this;
        }
        public String getDisputedpoints() {
            return this.disputedpoints;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setJudgReason(String judgReason) {
            this.judgReason = judgReason;
            return this;
        }
        public String getJudgReason() {
            return this.judgReason;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setKeyfacts(String keyfacts) {
            this.keyfacts = keyfacts;
            return this;
        }
        public String getKeyfacts() {
            return this.keyfacts;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setLegalBasis(String legalBasis) {
            this.legalBasis = legalBasis;
            return this;
        }
        public String getLegalBasis() {
            return this.legalBasis;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setLitigants(String litigants) {
            this.litigants = litigants;
            return this;
        }
        public String getLitigants() {
            return this.litigants;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setLitigationParticipant(String litigationParticipant) {
            this.litigationParticipant = litigationParticipant;
            return this;
        }
        public String getLitigationParticipant() {
            return this.litigationParticipant;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setOpenCaseCause(String openCaseCause) {
            this.openCaseCause = openCaseCause;
            return this;
        }
        public String getOpenCaseCause() {
            return this.openCaseCause;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setPreTrialProcess(String preTrialProcess) {
            this.preTrialProcess = preTrialProcess;
            return this;
        }
        public String getPreTrialProcess() {
            return this.preTrialProcess;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setReferLevel(String referLevel) {
            this.referLevel = referLevel;
            return this;
        }
        public String getReferLevel() {
            return this.referLevel;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setRefereeGist(String refereeGist) {
            this.refereeGist = refereeGist;
            return this;
        }
        public String getRefereeGist() {
            return this.refereeGist;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setSourceContent(String sourceContent) {
            this.sourceContent = sourceContent;
            return this;
        }
        public String getSourceContent() {
            return this.sourceContent;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setTrialCourt(RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt trialCourt) {
            this.trialCourt = trialCourt;
            return this;
        }
        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomainTrialCourt getTrialCourt() {
            return this.trialCourt;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setTrialDate(String trialDate) {
            this.trialDate = trialDate;
            return this;
        }
        public String getTrialDate() {
            return this.trialDate;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setTrialLevel(String trialLevel) {
            this.trialLevel = trialLevel;
            return this;
        }
        public String getTrialLevel() {
            return this.trialLevel;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setTrialProcess(String trialProcess) {
            this.trialProcess = trialProcess;
            return this;
        }
        public String getTrialProcess() {
            return this.trialProcess;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setTrialProgram(String trialProgram) {
            this.trialProgram = trialProgram;
            return this;
        }
        public String getTrialProgram() {
            return this.trialProgram;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain setVerdict(String verdict) {
            this.verdict = verdict;
            return this;
        }
        public String getVerdict() {
            return this.verdict;
        }

    }

    public static class RunSearchCaseFullTextResponseBodyDataCaseResult extends TeaModel {
        @NameInMap("caseDomain")
        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain caseDomain;

        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>0.88</p>
         */
        @NameInMap("similarity")
        public String similarity;

        public static RunSearchCaseFullTextResponseBodyDataCaseResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextResponseBodyDataCaseResult self = new RunSearchCaseFullTextResponseBodyDataCaseResult();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResult setCaseDomain(RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain caseDomain) {
            this.caseDomain = caseDomain;
            return this;
        }
        public RunSearchCaseFullTextResponseBodyDataCaseResultCaseDomain getCaseDomain() {
            return this.caseDomain;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResult setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public RunSearchCaseFullTextResponseBodyDataCaseResult setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class RunSearchCaseFullTextResponseBodyData extends TeaModel {
        @NameInMap("caseLevel")
        public String caseLevel;

        @NameInMap("caseResult")
        public java.util.List<RunSearchCaseFullTextResponseBodyDataCaseResult> caseResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("query")
        public String query;

        @NameInMap("queryKeywords")
        public java.util.List<String> queryKeywords;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static RunSearchCaseFullTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextResponseBodyData self = new RunSearchCaseFullTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextResponseBodyData setCaseLevel(String caseLevel) {
            this.caseLevel = caseLevel;
            return this;
        }
        public String getCaseLevel() {
            return this.caseLevel;
        }

        public RunSearchCaseFullTextResponseBodyData setCaseResult(java.util.List<RunSearchCaseFullTextResponseBodyDataCaseResult> caseResult) {
            this.caseResult = caseResult;
            return this;
        }
        public java.util.List<RunSearchCaseFullTextResponseBodyDataCaseResult> getCaseResult() {
            return this.caseResult;
        }

        public RunSearchCaseFullTextResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public RunSearchCaseFullTextResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RunSearchCaseFullTextResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public RunSearchCaseFullTextResponseBodyData setQueryKeywords(java.util.List<String> queryKeywords) {
            this.queryKeywords = queryKeywords;
            return this;
        }
        public java.util.List<String> getQueryKeywords() {
            return this.queryKeywords;
        }

        public RunSearchCaseFullTextResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
