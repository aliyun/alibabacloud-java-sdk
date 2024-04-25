// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpDepartmentsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListIdpDepartmentsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListIdpDepartmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdpDepartmentsResponseBody self = new ListIdpDepartmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdpDepartmentsResponseBody setData(ListIdpDepartmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIdpDepartmentsResponseBodyData getData() {
        return this.data;
    }

    public ListIdpDepartmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIdpDepartmentsResponseBodyDataDataList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("IdpConfigId")
        public String idpConfigId;

        @NameInMap("Name")
        public String name;

        public static ListIdpDepartmentsResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListIdpDepartmentsResponseBodyDataDataList self = new ListIdpDepartmentsResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListIdpDepartmentsResponseBodyDataDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIdpDepartmentsResponseBodyDataDataList setIdpConfigId(String idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }
        public String getIdpConfigId() {
            return this.idpConfigId;
        }

        public ListIdpDepartmentsResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIdpDepartmentsResponseBodyData extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<ListIdpDepartmentsResponseBodyDataDataList> dataList;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static ListIdpDepartmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIdpDepartmentsResponseBodyData self = new ListIdpDepartmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIdpDepartmentsResponseBodyData setDataList(java.util.List<ListIdpDepartmentsResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListIdpDepartmentsResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListIdpDepartmentsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
