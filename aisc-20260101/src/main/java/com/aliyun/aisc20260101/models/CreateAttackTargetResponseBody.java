// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateAttackTargetResponseBody extends TeaModel {
    /**
     * <p>The operation result. Upon successful creation, the TargetId of the new scan target is returned.</p>
     */
    @NameInMap("Data")
    public CreateAttackTargetResponseBodyData data;

    /**
     * <p>The request ID, used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAttackTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackTargetResponseBody self = new CreateAttackTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAttackTargetResponseBody setData(CreateAttackTargetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAttackTargetResponseBodyData getData() {
        return this.data;
    }

    public CreateAttackTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAttackTargetResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the created scan target. You can use this value as the TargetId parameter in subsequent calls such as TestConnectivity and scan task creation.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static CreateAttackTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAttackTargetResponseBodyData self = new CreateAttackTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAttackTargetResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
