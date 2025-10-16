// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyThreatIntelligenceSwitchRequest extends TeaModel {
    @NameInMap("CategoryList")
    public java.util.List<ModifyThreatIntelligenceSwitchRequestCategoryList> categoryList;

    public static ModifyThreatIntelligenceSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyThreatIntelligenceSwitchRequest self = new ModifyThreatIntelligenceSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyThreatIntelligenceSwitchRequest setCategoryList(java.util.List<ModifyThreatIntelligenceSwitchRequestCategoryList> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public java.util.List<ModifyThreatIntelligenceSwitchRequestCategoryList> getCategoryList() {
        return this.categoryList;
    }

    public static class ModifyThreatIntelligenceSwitchRequestCategoryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>IpOutThreatTorExit</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        public static ModifyThreatIntelligenceSwitchRequestCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ModifyThreatIntelligenceSwitchRequestCategoryList self = new ModifyThreatIntelligenceSwitchRequestCategoryList();
            return TeaModel.build(map, self);
        }

        public ModifyThreatIntelligenceSwitchRequestCategoryList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ModifyThreatIntelligenceSwitchRequestCategoryList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ModifyThreatIntelligenceSwitchRequestCategoryList setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

    }

}
