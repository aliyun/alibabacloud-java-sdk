// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateCrossAccountsRequest extends TeaModel {
    @NameInMap("CreateTargets")
    public java.util.List<UpdateCrossAccountsRequestCreateTargets> createTargets;

    @NameInMap("DeleteTargets")
    public java.util.List<UpdateCrossAccountsRequestDeleteTargets> deleteTargets;

    public static UpdateCrossAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossAccountsRequest self = new UpdateCrossAccountsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossAccountsRequest setCreateTargets(java.util.List<UpdateCrossAccountsRequestCreateTargets> createTargets) {
        this.createTargets = createTargets;
        return this;
    }
    public java.util.List<UpdateCrossAccountsRequestCreateTargets> getCreateTargets() {
        return this.createTargets;
    }

    public UpdateCrossAccountsRequest setDeleteTargets(java.util.List<UpdateCrossAccountsRequestDeleteTargets> deleteTargets) {
        this.deleteTargets = deleteTargets;
        return this;
    }
    public java.util.List<UpdateCrossAccountsRequestDeleteTargets> getDeleteTargets() {
        return this.deleteTargets;
    }

    public static class UpdateCrossAccountsRequestCreateTargets extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateCrossAccountsRequestCreateTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateCrossAccountsRequestCreateTargets self = new UpdateCrossAccountsRequestCreateTargets();
            return TeaModel.build(map, self);
        }

        public UpdateCrossAccountsRequestCreateTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public UpdateCrossAccountsRequestCreateTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateCrossAccountsRequestDeleteTargets extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateCrossAccountsRequestDeleteTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateCrossAccountsRequestDeleteTargets self = new UpdateCrossAccountsRequestDeleteTargets();
            return TeaModel.build(map, self);
        }

        public UpdateCrossAccountsRequestDeleteTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public UpdateCrossAccountsRequestDeleteTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
