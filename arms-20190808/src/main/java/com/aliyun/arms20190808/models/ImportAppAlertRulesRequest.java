// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the alert contact groups. The value must be a JSON array.</p>
     */
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    /**
     * <p>Specifies whether to enable the alert rule after it is created. Default value: `false`.</p>
     * <br>
     * <p>*   `true`: enables the alert rule.</p>
     * <p>*   `false`: disables the alert rule.</p>
     */
    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    /**
     * <p>The process identifiers (PIDs) of the applications associated with the alert rule. The value must be a JSON array. For more information about how to obtain the PID, see [Obtain the PID of an application](~~186100#section-bkl-3j6-ezg~~).</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>The ID of the region where the associated applications reside.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ImportAppAlertRulesRequestTags> tags;

    /**
     * <p>The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails. For more information about the TemplageAlertConfig parameter, see the following **additional information about the TemplageAlertConfig parameter**.</p>
     */
    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    /**
     * <p>The ID of the alert template. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails.</p>
     */
    @NameInMap("TemplateAlertId")
    public String templateAlertId;

    public static ImportAppAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesRequest self = new ImportAppAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportAppAlertRulesRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public ImportAppAlertRulesRequest setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
        return this;
    }
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    public ImportAppAlertRulesRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public ImportAppAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportAppAlertRulesRequest setTags(java.util.List<ImportAppAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ImportAppAlertRulesRequestTags> getTags() {
        return this.tags;
    }

    public ImportAppAlertRulesRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    public ImportAppAlertRulesRequest setTemplateAlertId(String templateAlertId) {
        this.templateAlertId = templateAlertId;
        return this;
    }
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public static class ImportAppAlertRulesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImportAppAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ImportAppAlertRulesRequestTags self = new ImportAppAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public ImportAppAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ImportAppAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
