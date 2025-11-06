// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeDownstreamBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListExchangeDownstreamBindingsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListExchangeDownstreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeDownstreamBindingsResponseBody self = new ListExchangeDownstreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangeDownstreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExchangeDownstreamBindingsResponseBody setData(ListExchangeDownstreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangeDownstreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListExchangeDownstreamBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExchangeDownstreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExchangeDownstreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO extends TeaModel {
        @NameInMap("Argument")
        public String argument;

        @NameInMap("BindingKey")
        public String bindingKey;

        @NameInMap("BindingType")
        public Integer bindingType;

        @NameInMap("DstName")
        public String dstName;

        @NameInMap("SrcName")
        public String srcName;

        public static ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO self = new ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO();
            return TeaModel.build(map, self);
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO setBindingType(Integer bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public Integer getBindingType() {
            return this.bindingType;
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO setDstName(String dstName) {
            this.dstName = dstName;
            return this;
        }
        public String getDstName() {
            return this.dstName;
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO setSrcName(String srcName) {
            this.srcName = srcName;
            return this;
        }
        public String getSrcName() {
            return this.srcName;
        }

    }

    public static class ListExchangeDownstreamBindingsResponseBodyDataVoList extends TeaModel {
        @NameInMap("BindingVO")
        public java.util.List<ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO> bindingVO;

        public static ListExchangeDownstreamBindingsResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeDownstreamBindingsResponseBodyDataVoList self = new ListExchangeDownstreamBindingsResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListExchangeDownstreamBindingsResponseBodyDataVoList setBindingVO(java.util.List<ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO> bindingVO) {
            this.bindingVO = bindingVO;
            return this;
        }
        public java.util.List<ListExchangeDownstreamBindingsResponseBodyDataVoListBindingVO> getBindingVO() {
            return this.bindingVO;
        }

    }

    public static class ListExchangeDownstreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("VoList")
        public ListExchangeDownstreamBindingsResponseBodyDataVoList voList;

        public static ListExchangeDownstreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeDownstreamBindingsResponseBodyData self = new ListExchangeDownstreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangeDownstreamBindingsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListExchangeDownstreamBindingsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListExchangeDownstreamBindingsResponseBodyData setVoList(ListExchangeDownstreamBindingsResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListExchangeDownstreamBindingsResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
