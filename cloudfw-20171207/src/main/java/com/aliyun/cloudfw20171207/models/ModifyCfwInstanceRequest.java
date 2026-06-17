// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyCfwInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Firewall instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-zsk39m******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of instance properties to update.</p>
     */
    @NameInMap("UpdateList")
    public java.util.List<ModifyCfwInstanceRequestUpdateList> updateList;

    public static ModifyCfwInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCfwInstanceRequest self = new ModifyCfwInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCfwInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCfwInstanceRequest setUpdateList(java.util.List<ModifyCfwInstanceRequestUpdateList> updateList) {
        this.updateList = updateList;
        return this;
    }
    public java.util.List<ModifyCfwInstanceRequestUpdateList> getUpdateList() {
        return this.updateList;
    }

    public static class ModifyCfwInstanceRequestUpdateList extends TeaModel {
        /**
         * <p>The code of the instance property to update.
         * The following codes are supported:</p>
         * <ul>
         * <li><p>\<code>Code\\</code>: \<code>MajorVersion\\</code>. Set \<code>Value\\</code> to \<code>2\\</code>. This is available only for pay-as-you-go 1.0 users to upgrade their instances to pay-as-you-go 2.0.</p>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>Make sure you understand the billing methods and pricing of pay-as-you-go 2.0.</p>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>Note that if log delivery is enabled before the upgrade, it will remain enabled after the upgrade, and logs will be delivered to a new Logstore.</p>
         * </li>
         * <li><p>\<code>Code\\</code>: \<code>ThreatIntelligence\\</code>. This is available only for pay-as-you-go 2.0 users to enable or disable the threat intelligence feature. Set \<code>Value\\</code> to \<code>1\\</code> to enable the feature or \<code>0\\</code> to disable it.</p>
         * </li>
         * <li><p>\<code>Code\\</code>: \<code>Sdl\\</code>. This is available only for pay-as-you-go 2.0 users to enable or disable the sensitive data leak detection feature. Set \<code>Value\\</code> to \<code>1\\</code> to enable the feature or \<code>0\\</code> to disable it.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sdl</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value for the specified \<code>Code\\</code>. For valid values, see the description of the \<code>Code\\</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyCfwInstanceRequestUpdateList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCfwInstanceRequestUpdateList self = new ModifyCfwInstanceRequestUpdateList();
            return TeaModel.build(map, self);
        }

        public ModifyCfwInstanceRequestUpdateList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyCfwInstanceRequestUpdateList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
