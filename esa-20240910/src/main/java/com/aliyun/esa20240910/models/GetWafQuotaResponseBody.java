// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaResponseBody extends TeaModel {
    /**
     * <p>Returned quota information.</p>
     */
    @NameInMap("Quota")
    public GetWafQuotaResponseBodyQuota quota;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWafQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWafQuotaResponseBody self = new GetWafQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWafQuotaResponseBody setQuota(GetWafQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetWafQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public GetWafQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWafQuotaResponseBodyQuotaCaptcha extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("NumberTotal")
        public WafQuotaInteger numberTotal;

        public static GetWafQuotaResponseBodyQuotaCaptcha build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuotaCaptcha self = new GetWafQuotaResponseBodyQuotaCaptcha();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuotaCaptcha setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafQuotaResponseBodyQuotaCaptcha setNumberTotal(WafQuotaInteger numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

    }

    public static class GetWafQuotaResponseBodyQuotaList extends TeaModel {
        /**
         * <p>Indicates whether the custom list is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>An object containing quota information for each type of item in the custom list.</p>
         */
        @NameInMap("Items")
        public java.util.Map<String, QuotaListItemsValue> items;

        /**
         * <p>The number quota allowed per custom list.</p>
         */
        @NameInMap("NumberItemsPerList")
        public WafQuotaInteger numberItemsPerList;

        /**
         * <p>The total number quota allowed for items in all custom lists.</p>
         */
        @NameInMap("NumberItemsTotal")
        public WafQuotaInteger numberItemsTotal;

        /**
         * <p>The total number quota allowed for custom lists.</p>
         */
        @NameInMap("NumberTotal")
        public WafQuotaInteger numberTotal;

        public static GetWafQuotaResponseBodyQuotaList build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuotaList self = new GetWafQuotaResponseBodyQuotaList();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuotaList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafQuotaResponseBodyQuotaList setItems(java.util.Map<String, QuotaListItemsValue> items) {
            this.items = items;
            return this;
        }
        public java.util.Map<String, QuotaListItemsValue> getItems() {
            return this.items;
        }

        public GetWafQuotaResponseBodyQuotaList setNumberItemsPerList(WafQuotaInteger numberItemsPerList) {
            this.numberItemsPerList = numberItemsPerList;
            return this;
        }
        public WafQuotaInteger getNumberItemsPerList() {
            return this.numberItemsPerList;
        }

        public GetWafQuotaResponseBodyQuotaList setNumberItemsTotal(WafQuotaInteger numberItemsTotal) {
            this.numberItemsTotal = numberItemsTotal;
            return this;
        }
        public WafQuotaInteger getNumberItemsTotal() {
            return this.numberItemsTotal;
        }

        public GetWafQuotaResponseBodyQuotaList setNumberTotal(WafQuotaInteger numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

    }

    public static class GetWafQuotaResponseBodyQuotaManagedRulesGroup extends TeaModel {
        /**
         * <p>Indicates whether the WAF managed rules group is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The total number quota allowed for the WAF managed rules group.</p>
         */
        @NameInMap("NumberTotal")
        public WafQuotaInteger numberTotal;

        public static GetWafQuotaResponseBodyQuotaManagedRulesGroup build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuotaManagedRulesGroup self = new GetWafQuotaResponseBodyQuotaManagedRulesGroup();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuotaManagedRulesGroup setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafQuotaResponseBodyQuotaManagedRulesGroup setNumberTotal(WafQuotaInteger numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

    }

    public static class GetWafQuotaResponseBodyQuotaPage extends TeaModel {
        /**
         * <p>An object containing quota information for each Content-Type in custom response pages.</p>
         */
        @NameInMap("ContentTypes")
        public java.util.Map<String, QuotaPageContentTypesValue> contentTypes;

        /**
         * <p>Indicates whether the custom response page is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The total number quota allowed for custom response pages.</p>
         */
        @NameInMap("NumberTotal")
        public WafQuotaInteger numberTotal;

        public static GetWafQuotaResponseBodyQuotaPage build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuotaPage self = new GetWafQuotaResponseBodyQuotaPage();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuotaPage setContentTypes(java.util.Map<String, QuotaPageContentTypesValue> contentTypes) {
            this.contentTypes = contentTypes;
            return this;
        }
        public java.util.Map<String, QuotaPageContentTypesValue> getContentTypes() {
            return this.contentTypes;
        }

        public GetWafQuotaResponseBodyQuotaPage setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafQuotaResponseBodyQuotaPage setNumberTotal(WafQuotaInteger numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

    }

    public static class GetWafQuotaResponseBodyQuotaScenePolicy extends TeaModel {
        /**
         * <p>Indicates whether the scene protection feature is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The total number quota for scene protection rules.</p>
         */
        @NameInMap("NumberTotal")
        public WafQuotaInteger numberTotal;

        public static GetWafQuotaResponseBodyQuotaScenePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuotaScenePolicy self = new GetWafQuotaResponseBodyQuotaScenePolicy();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuotaScenePolicy setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafQuotaResponseBodyQuotaScenePolicy setNumberTotal(WafQuotaInteger numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

    }

    public static class GetWafQuotaResponseBodyQuota extends TeaModel {
        @NameInMap("Captcha")
        public GetWafQuotaResponseBodyQuotaCaptcha captcha;

        /**
         * <p>Quota information related to custom lists.</p>
         */
        @NameInMap("List")
        public GetWafQuotaResponseBodyQuotaList list;

        /**
         * <p>Quota information related to the WAF managed rules group.</p>
         */
        @NameInMap("ManagedRulesGroup")
        public GetWafQuotaResponseBodyQuotaManagedRulesGroup managedRulesGroup;

        /**
         * <p>Quota information related to custom response pages.</p>
         */
        @NameInMap("Page")
        public GetWafQuotaResponseBodyQuotaPage page;

        /**
         * <p>Quota information related to scene protection.</p>
         */
        @NameInMap("ScenePolicy")
        public GetWafQuotaResponseBodyQuotaScenePolicy scenePolicy;

        public static GetWafQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuota self = new GetWafQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetWafQuotaResponseBodyQuota setCaptcha(GetWafQuotaResponseBodyQuotaCaptcha captcha) {
            this.captcha = captcha;
            return this;
        }
        public GetWafQuotaResponseBodyQuotaCaptcha getCaptcha() {
            return this.captcha;
        }

        public GetWafQuotaResponseBodyQuota setList(GetWafQuotaResponseBodyQuotaList list) {
            this.list = list;
            return this;
        }
        public GetWafQuotaResponseBodyQuotaList getList() {
            return this.list;
        }

        public GetWafQuotaResponseBodyQuota setManagedRulesGroup(GetWafQuotaResponseBodyQuotaManagedRulesGroup managedRulesGroup) {
            this.managedRulesGroup = managedRulesGroup;
            return this;
        }
        public GetWafQuotaResponseBodyQuotaManagedRulesGroup getManagedRulesGroup() {
            return this.managedRulesGroup;
        }

        public GetWafQuotaResponseBodyQuota setPage(GetWafQuotaResponseBodyQuotaPage page) {
            this.page = page;
            return this;
        }
        public GetWafQuotaResponseBodyQuotaPage getPage() {
            return this.page;
        }

        public GetWafQuotaResponseBodyQuota setScenePolicy(GetWafQuotaResponseBodyQuotaScenePolicy scenePolicy) {
            this.scenePolicy = scenePolicy;
            return this;
        }
        public GetWafQuotaResponseBodyQuotaScenePolicy getScenePolicy() {
            return this.scenePolicy;
        }

    }

}
