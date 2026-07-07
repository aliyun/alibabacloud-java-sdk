// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionInfoResponseBody extends TeaModel {
    /**
     * <p>The build ID of the code.</p>
     * 
     * <strong>example:</strong>
     * <p>26035169</p>
     */
    @NameInMap("BuildId")
    public Long buildId;

    /**
     * <p>The description of the code version.</p>
     * 
     * <strong>example:</strong>
     * <p>code desc version unstable</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The code version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The list of configuration items for the code version.</p>
     */
    @NameInMap("ConfOptions")
    public GetRoutineCodeVersionInfoResponseBodyConfOptions confOptions;

    /**
     * <p>The time when the code version was created. The time follows the RFC 3339 standard in the UTC time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-04T01:54:19Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The extra information of the code version. The value is in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>Indicates whether the code version contains Assets files.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAssets")
    public Boolean hasAssets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the code version.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetRoutineCodeVersionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionInfoResponseBody self = new GetRoutineCodeVersionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionInfoResponseBody setBuildId(Long buildId) {
        this.buildId = buildId;
        return this;
    }
    public Long getBuildId() {
        return this.buildId;
    }

    public GetRoutineCodeVersionInfoResponseBody setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public GetRoutineCodeVersionInfoResponseBody setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public GetRoutineCodeVersionInfoResponseBody setConfOptions(GetRoutineCodeVersionInfoResponseBodyConfOptions confOptions) {
        this.confOptions = confOptions;
        return this;
    }
    public GetRoutineCodeVersionInfoResponseBodyConfOptions getConfOptions() {
        return this.confOptions;
    }

    public GetRoutineCodeVersionInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineCodeVersionInfoResponseBody setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GetRoutineCodeVersionInfoResponseBody setHasAssets(Boolean hasAssets) {
        this.hasAssets = hasAssets;
        return this;
    }
    public Boolean getHasAssets() {
        return this.hasAssets;
    }

    public GetRoutineCodeVersionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineCodeVersionInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetRoutineCodeVersionInfoResponseBodyConfOptions extends TeaModel {
        /**
         * <p>The NotFoundStrategy configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>SinglePageApplication</p>
         */
        @NameInMap("NotFoundStrategy")
        public String notFoundStrategy;

        public static GetRoutineCodeVersionInfoResponseBodyConfOptions build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineCodeVersionInfoResponseBodyConfOptions self = new GetRoutineCodeVersionInfoResponseBodyConfOptions();
            return TeaModel.build(map, self);
        }

        public GetRoutineCodeVersionInfoResponseBodyConfOptions setNotFoundStrategy(String notFoundStrategy) {
            this.notFoundStrategy = notFoundStrategy;
            return this;
        }
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

    }

}
