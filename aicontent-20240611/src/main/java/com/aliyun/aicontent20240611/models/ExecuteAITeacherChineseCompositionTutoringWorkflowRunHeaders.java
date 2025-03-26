// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("callerParentId")
    public Long callerParentId;

    /**
     * <strong>example:</strong>
     * <p>sub</p>
     */
    @NameInMap("callerType")
    public String callerType;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("callerUid")
    public Long callerUid;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("stsTokenCallerUid")
    public Long stsTokenCallerUid;

    public static ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders self = new ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunHeaders setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
