// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SaveCostCenterShareRuleRequest extends TeaModel {
    @NameInMap("CreateShareRuleList")
    public java.util.List<SaveCostCenterShareRuleRequestCreateShareRuleList> createShareRuleList;

    @NameInMap("ModifyShareRuleList")
    public java.util.List<SaveCostCenterShareRuleRequestModifyShareRuleList> modifyShareRuleList;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>1977800748053695</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    @NameInMap("RemoveShareRuleList")
    public java.util.List<Long> removeShareRuleList;

    public static SaveCostCenterShareRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCostCenterShareRuleRequest self = new SaveCostCenterShareRuleRequest();
        return TeaModel.build(map, self);
    }

    public SaveCostCenterShareRuleRequest setCreateShareRuleList(java.util.List<SaveCostCenterShareRuleRequestCreateShareRuleList> createShareRuleList) {
        this.createShareRuleList = createShareRuleList;
        return this;
    }
    public java.util.List<SaveCostCenterShareRuleRequestCreateShareRuleList> getCreateShareRuleList() {
        return this.createShareRuleList;
    }

    public SaveCostCenterShareRuleRequest setModifyShareRuleList(java.util.List<SaveCostCenterShareRuleRequestModifyShareRuleList> modifyShareRuleList) {
        this.modifyShareRuleList = modifyShareRuleList;
        return this;
    }
    public java.util.List<SaveCostCenterShareRuleRequestModifyShareRuleList> getModifyShareRuleList() {
        return this.modifyShareRuleList;
    }

    public SaveCostCenterShareRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public SaveCostCenterShareRuleRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public SaveCostCenterShareRuleRequest setRemoveShareRuleList(java.util.List<Long> removeShareRuleList) {
        this.removeShareRuleList = removeShareRuleList;
        return this;
    }
    public java.util.List<Long> getRemoveShareRuleList() {
        return this.removeShareRuleList;
    }

    public static class SaveCostCenterShareRuleRequestCreateShareRuleList extends TeaModel {
        @NameInMap("FromCostCenterList")
        public java.util.List<Long> fromCostCenterList;

        @NameInMap("ShareRatioList")
        public java.util.List<Double> shareRatioList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ShareRuleName")
        public String shareRuleName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RATIO</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("ToCostCenterList")
        public java.util.List<Long> toCostCenterList;

        public static SaveCostCenterShareRuleRequestCreateShareRuleList build(java.util.Map<String, ?> map) throws Exception {
            SaveCostCenterShareRuleRequestCreateShareRuleList self = new SaveCostCenterShareRuleRequestCreateShareRuleList();
            return TeaModel.build(map, self);
        }

        public SaveCostCenterShareRuleRequestCreateShareRuleList setFromCostCenterList(java.util.List<Long> fromCostCenterList) {
            this.fromCostCenterList = fromCostCenterList;
            return this;
        }
        public java.util.List<Long> getFromCostCenterList() {
            return this.fromCostCenterList;
        }

        public SaveCostCenterShareRuleRequestCreateShareRuleList setShareRatioList(java.util.List<Double> shareRatioList) {
            this.shareRatioList = shareRatioList;
            return this;
        }
        public java.util.List<Double> getShareRatioList() {
            return this.shareRatioList;
        }

        public SaveCostCenterShareRuleRequestCreateShareRuleList setShareRuleName(String shareRuleName) {
            this.shareRuleName = shareRuleName;
            return this;
        }
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        public SaveCostCenterShareRuleRequestCreateShareRuleList setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public SaveCostCenterShareRuleRequestCreateShareRuleList setToCostCenterList(java.util.List<Long> toCostCenterList) {
            this.toCostCenterList = toCostCenterList;
            return this;
        }
        public java.util.List<Long> getToCostCenterList() {
            return this.toCostCenterList;
        }

    }

    public static class SaveCostCenterShareRuleRequestModifyShareRuleList extends TeaModel {
        @NameInMap("FromCostCenterList")
        public java.util.List<Long> fromCostCenterList;

        @NameInMap("ShareRatioList")
        public java.util.List<Double> shareRatioList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1828</p>
         */
        @NameInMap("ShareRuleId")
        public Long shareRuleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ShareRuleName")
        public String shareRuleName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("ToCostCenterList")
        public java.util.List<Long> toCostCenterList;

        public static SaveCostCenterShareRuleRequestModifyShareRuleList build(java.util.Map<String, ?> map) throws Exception {
            SaveCostCenterShareRuleRequestModifyShareRuleList self = new SaveCostCenterShareRuleRequestModifyShareRuleList();
            return TeaModel.build(map, self);
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setFromCostCenterList(java.util.List<Long> fromCostCenterList) {
            this.fromCostCenterList = fromCostCenterList;
            return this;
        }
        public java.util.List<Long> getFromCostCenterList() {
            return this.fromCostCenterList;
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setShareRatioList(java.util.List<Double> shareRatioList) {
            this.shareRatioList = shareRatioList;
            return this;
        }
        public java.util.List<Double> getShareRatioList() {
            return this.shareRatioList;
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setShareRuleId(Long shareRuleId) {
            this.shareRuleId = shareRuleId;
            return this;
        }
        public Long getShareRuleId() {
            return this.shareRuleId;
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setShareRuleName(String shareRuleName) {
            this.shareRuleName = shareRuleName;
            return this;
        }
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public SaveCostCenterShareRuleRequestModifyShareRuleList setToCostCenterList(java.util.List<Long> toCostCenterList) {
            this.toCostCenterList = toCostCenterList;
            return this;
        }
        public java.util.List<Long> getToCostCenterList() {
            return this.toCostCenterList;
        }

    }

}
