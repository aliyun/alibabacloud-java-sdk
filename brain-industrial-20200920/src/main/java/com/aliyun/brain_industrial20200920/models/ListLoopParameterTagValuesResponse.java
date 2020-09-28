// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListLoopParameterTagValuesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TagsValuesRsp")
    @Validation(required = true)
    public ListLoopParameterTagValuesResponseTagsValuesRsp tagsValuesRsp;

    public static ListLoopParameterTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLoopParameterTagValuesResponse self = new ListLoopParameterTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListLoopParameterTagValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoopParameterTagValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLoopParameterTagValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLoopParameterTagValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLoopParameterTagValuesResponse setTagsValuesRsp(ListLoopParameterTagValuesResponseTagsValuesRsp tagsValuesRsp) {
        this.tagsValuesRsp = tagsValuesRsp;
        return this;
    }
    public ListLoopParameterTagValuesResponseTagsValuesRsp getTagsValuesRsp() {
        return this.tagsValuesRsp;
    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataListOp extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataListOp build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataListOp self = new ListLoopParameterTagValuesResponseTagsValuesRspDataListOp();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 self = new ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 self = new ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataListSp extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataListSp build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataListSp self = new ListLoopParameterTagValuesResponseTagsValuesRspDataListSp();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListSp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListSp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListSp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataListPv extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataListPv build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataListPv self = new ListLoopParameterTagValuesResponseTagsValuesRspDataListPv();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataListPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRspDataList extends TeaModel {
        @NameInMap("Op")
        @Validation(required = true)
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp> op;

        @NameInMap("Op1")
        @Validation(required = true)
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1> op1;

        @NameInMap("Op2")
        @Validation(required = true)
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2> op2;

        @NameInMap("Sp")
        @Validation(required = true)
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListSp> sp;

        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListPv> pv;

        public static ListLoopParameterTagValuesResponseTagsValuesRspDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRspDataList self = new ListLoopParameterTagValuesResponseTagsValuesRspDataList();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataList setOp(java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp> op) {
            this.op = op;
            return this;
        }
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp> getOp() {
            return this.op;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataList setOp1(java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1> op1) {
            this.op1 = op1;
            return this;
        }
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp1> getOp1() {
            return this.op1;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataList setOp2(java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2> op2) {
            this.op2 = op2;
            return this;
        }
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListOp2> getOp2() {
            return this.op2;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataList setSp(java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListSp> sp) {
            this.sp = sp;
            return this;
        }
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListSp> getSp() {
            return this.sp;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRspDataList setPv(java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<ListLoopParameterTagValuesResponseTagsValuesRspDataListPv> getPv() {
            return this.pv;
        }

    }

    public static class ListLoopParameterTagValuesResponseTagsValuesRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("DataList")
        @Validation(required = true)
        public ListLoopParameterTagValuesResponseTagsValuesRspDataList dataList;

        public static ListLoopParameterTagValuesResponseTagsValuesRsp build(java.util.Map<String, ?> map) throws Exception {
            ListLoopParameterTagValuesResponseTagsValuesRsp self = new ListLoopParameterTagValuesResponseTagsValuesRsp();
            return TeaModel.build(map, self);
        }

        public ListLoopParameterTagValuesResponseTagsValuesRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListLoopParameterTagValuesResponseTagsValuesRsp setDataList(ListLoopParameterTagValuesResponseTagsValuesRspDataList dataList) {
            this.dataList = dataList;
            return this;
        }
        public ListLoopParameterTagValuesResponseTagsValuesRspDataList getDataList() {
            return this.dataList;
        }

    }

}
