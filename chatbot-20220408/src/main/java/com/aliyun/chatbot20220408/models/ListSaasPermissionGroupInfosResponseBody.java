// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasPermissionGroupInfosResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSaasPermissionGroupInfosResponseBodyData> data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("PgCode")
        public String pgCode;

        @NameInMap("PgEnName")
        public String pgEnName;

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
        @NameInMap("EnName")
        public String enName;

        @NameInMap("Name")
        public String name;

        @NameInMap("PgInfos")
        public java.util.List<ListSaasPermissionGroupInfosResponseBodyDataPgInfos> pgInfos;

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
