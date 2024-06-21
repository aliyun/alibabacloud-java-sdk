// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the alert contact groups. The value must be a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[123, 234]</p>
     */
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    /**
     * <p>Specifies whether to enable the alert rule after it is created. Default value: <code>false</code>.</p>
     * <ul>
     * <li><code>true</code>: enables the alert rule.</li>
     * <li><code>false</code>: disables the alert rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    /**
     * <p>The process identifiers (PIDs) of the applications associated with the alert rule. The value must be a JSON array. For more information about how to obtain the PID, see <a href="~~186100#section-bkl-3j6-ezg~~">Obtain the PID of an application</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;atc889zkcf@d8deedfa9bfxxxx&quot;, &quot;acd129bfcf@d5daebfa6cdxxxx&quot;]</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>The ID of the region where the associated applications reside.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ImportAppAlertRulesRequestTags> tags;

    /**
     * <p>The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the <strong>TemplateAlertId</strong> and <strong>TemplageAlertConfig</strong> parameters. If you set both parameters, the <strong>TemplateAlertId</strong> parameter prevails. For more information about the TemplageAlertConfig parameter, see the following <strong>additional information about the TemplageAlertConfig parameter</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;contactGroupIds&quot;: &quot;381&quot;, &quot;alertType&quot;: 5, &quot;alarmContext&quot;: { &quot;subTitle&quot;: &quot;&quot;, &quot;content&quot;: &quot;Alarm name: $alarm name\nFilter condition: $filter\nAlarm time : $Alarm time\nAlarm content: $Alarm content\nNote: Before the recovery email is received, the alarm is in continuous alarm, and you will be reminded again after 24 hours!&quot; }, &quot;alertLevel&quot;: &quot;WARN&quot;, &quot; metricParam&quot;: { &quot;appId&quot;: &quot;70901&quot;, &quot;pid&quot;: &quot;atc889zkcf@d8deedfa9bf****&quot;, &quot;type&quot;: &quot;TXN&quot;, &quot;dimensions&quot;: [ { &quot;type&quot;: &quot;STATIC&quot;, &quot;value &quot;: &quot;\\/hello_test_api_address\\/test1&quot;, &quot;key&quot;: &quot;rpc&quot; } ] }, &quot;alertWay&quot;: [ &quot;SMS&quot;, &quot;MAIL&quot;, &quot;DING_ROBOT&quot; ], &quot;alertRule&quot;: { &quot;rules&quot; : [ { &quot;measure&quot;: &quot;appstat.txn.rt&quot;, &quot;alias&quot;: &quot;Entry call response time_ms&quot;, &quot;aggregates&quot;: &quot;AVG&quot;, &quot;nValue&quot;: 1, &quot;value&quot;: 1, &quot;operator &quot;: &quot;CURRENT_GTE&quot; } ], &quot;operator&quot;: &quot;|&quot; }, &quot;title&quot;: &quot;Alarm template alarm name&quot;, &quot;config&quot;: &quot;{\&quot;continuous\&quot;:false,\&quot;dataRevision\&quot;:2, \&quot;ownerId\&quot;:\&quot;123412341234\&quot;}&quot;, &quot;notice&quot;: { &quot;noticeStartTime&quot;: 1480521600000, &quot;startTime&quot;: 1480521600000, &quot;endTime&quot;: 1480607940000, &quot;noticeEndTime&quot;: 1480607940000 }, &quot;stat us&quot;: &quot;NON &quot; } ]</p>
     */
    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    /**
     * <p>The ID of the alert template. You must set at least one of the <strong>TemplateAlertId</strong> and <strong>TemplageAlertConfig</strong> parameters. If you set both parameters, the <strong>TemplateAlertId</strong> parameter prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>324324234</p>
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
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
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
