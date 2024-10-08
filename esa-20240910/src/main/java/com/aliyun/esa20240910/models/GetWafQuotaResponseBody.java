// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    public GetWafQuotaResponseBodyQuota quota;

    /**
     * <p>Id of the request</p>
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

    public static class GetWafQuotaResponseBodyQuotaList extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Items")
        public java.util.Map<String, QuotaListItemsValue> items;

        @NameInMap("NumberItemsPerList")
        public WafQuotaInteger numberItemsPerList;

        @NameInMap("NumberItemsTotal")
        public WafQuotaInteger numberItemsTotal;

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
        @NameInMap("Enable")
        public Boolean enable;

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
        @NameInMap("ContentTypes")
        public java.util.Map<String, QuotaPageContentTypesValue> contentTypes;

        @NameInMap("Enable")
        public Boolean enable;

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
        @NameInMap("Enable")
        public Boolean enable;

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
        @NameInMap("List")
        public GetWafQuotaResponseBodyQuotaList list;

        @NameInMap("ManagedRulesGroup")
        public GetWafQuotaResponseBodyQuotaManagedRulesGroup managedRulesGroup;

        @NameInMap("Page")
        public GetWafQuotaResponseBodyQuotaPage page;

        @NameInMap("ScenePolicy")
        public GetWafQuotaResponseBodyQuotaScenePolicy scenePolicy;

        public static GetWafQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetWafQuotaResponseBodyQuota self = new GetWafQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
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
