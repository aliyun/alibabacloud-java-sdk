// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListMPCoSPhaseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMPCoSPhaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseResponseBody self = new ListMPCoSPhaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMPCoSPhaseResponseBody setData(ListMPCoSPhaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMPCoSPhaseResponseBodyData getData() {
        return this.data;
    }

    public ListMPCoSPhaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMPCoSPhaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMPCoSPhaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMPCoSPhaseResponseBodyDataPageData extends TeaModel {
        @NameInMap("AccessPermission")
        public Integer accessPermission;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhaseId")
        public String phaseId;

        @NameInMap("Remark")
        public String remark;

        public static ListMPCoSPhaseResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseResponseBodyDataPageData self = new ListMPCoSPhaseResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseResponseBodyDataPageData setAccessPermission(Integer accessPermission) {
            this.accessPermission = accessPermission;
            return this;
        }
        public Integer getAccessPermission() {
            return this.accessPermission;
        }

        public ListMPCoSPhaseResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMPCoSPhaseResponseBodyDataPageData setPhaseId(String phaseId) {
            this.phaseId = phaseId;
            return this;
        }
        public String getPhaseId() {
            return this.phaseId;
        }

        public ListMPCoSPhaseResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class ListMPCoSPhaseResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMPCoSPhaseResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMPCoSPhaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseResponseBodyData self = new ListMPCoSPhaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMPCoSPhaseResponseBodyData setPageData(java.util.List<ListMPCoSPhaseResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMPCoSPhaseResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMPCoSPhaseResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMPCoSPhaseResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
