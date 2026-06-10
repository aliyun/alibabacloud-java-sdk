// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasPermissionGroupInfosResponseBody extends TeaModel {
    /**
     * <p>The permission details for integrated SaaS pages.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSaasPermissionGroupInfosResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AD9FA10-7780-5E12-B701-13C928524F32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSaasPermissionGroupInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSaasPermissionGroupInfosResponseBody self = new ListSaasPermissionGroupInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSaasPermissionGroupInfosResponseBody setData(java.util.List<ListSaasPermissionGroupInfosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSaasPermissionGroupInfosResponseBodyData> getData() {
        return this.data;
    }

    public ListSaasPermissionGroupInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSaasPermissionGroupInfosResponseBodyDataPgInfos extends TeaModel {
        /**
         * <p>The unique permission group code.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ</p>
         */
        @NameInMap("PgCode")
        public String pgCode;

        /**
         * <p>The English name of the permission group.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ</p>
         */
        @NameInMap("PgEnName")
        public String pgEnName;

        /**
         * <p>The name of the permission group.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ管理</p>
         */
        @NameInMap("PgName")
        public String pgName;

        public static ListSaasPermissionGroupInfosResponseBodyDataPgInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSaasPermissionGroupInfosResponseBodyDataPgInfos self = new ListSaasPermissionGroupInfosResponseBodyDataPgInfos();
            return TeaModel.build(map, self);
        }

        public ListSaasPermissionGroupInfosResponseBodyDataPgInfos setPgCode(String pgCode) {
            this.pgCode = pgCode;
            return this;
        }
        public String getPgCode() {
            return this.pgCode;
        }

        public ListSaasPermissionGroupInfosResponseBodyDataPgInfos setPgEnName(String pgEnName) {
            this.pgEnName = pgEnName;
            return this;
        }
        public String getPgEnName() {
            return this.pgEnName;
        }

        public ListSaasPermissionGroupInfosResponseBodyDataPgInfos setPgName(String pgName) {
            this.pgName = pgName;
            return this;
        }
        public String getPgName() {
            return this.pgName;
        }

    }

    public static class ListSaasPermissionGroupInfosResponseBodyData extends TeaModel {
        /**
         * <p>The name of the page in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Release Center</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>The name of the page.</p>
         * 
         * <strong>example:</strong>
         * <p>发布中心</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The SaaS permission groups.</p>
         */
        @NameInMap("PgInfos")
        public java.util.List<ListSaasPermissionGroupInfosResponseBodyDataPgInfos> pgInfos;

        /**
         * <p>The unique code for the SaaS page.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ</p>
         */
        @NameInMap("SaasCode")
        public String saasCode;

        public static ListSaasPermissionGroupInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSaasPermissionGroupInfosResponseBodyData self = new ListSaasPermissionGroupInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSaasPermissionGroupInfosResponseBodyData setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public ListSaasPermissionGroupInfosResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSaasPermissionGroupInfosResponseBodyData setPgInfos(java.util.List<ListSaasPermissionGroupInfosResponseBodyDataPgInfos> pgInfos) {
            this.pgInfos = pgInfos;
            return this;
        }
        public java.util.List<ListSaasPermissionGroupInfosResponseBodyDataPgInfos> getPgInfos() {
            return this.pgInfos;
        }

        public ListSaasPermissionGroupInfosResponseBodyData setSaasCode(String saasCode) {
            this.saasCode = saasCode;
            return this;
        }
        public String getSaasCode() {
            return this.saasCode;
        }

    }

}
