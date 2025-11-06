// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeUpstreamBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListExchangeUpstreamBindingsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListExchangeUpstreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeUpstreamBindingsResponseBody self = new ListExchangeUpstreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangeUpstreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExchangeUpstreamBindingsResponseBody setData(ListExchangeUpstreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangeUpstreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListExchangeUpstreamBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExchangeUpstreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExchangeUpstreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO extends TeaModel {
        @NameInMap("Argument")
        public String argument;

        @NameInMap("BindType")
        public Integer bindType;

        @NameInMap("BindingKey")
        public String bindingKey;

        @NameInMap("DstName")
        public String dstName;

        @NameInMap("SrcName")
        public String srcName;

        public static ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO self = new ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO setBindType(Integer bindType) {
            this.bindType = bindType;
            return this;
        }
        public Integer getBindType() {
            return this.bindType;
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO setDstName(String dstName) {
            this.dstName = dstName;
            return this;
        }
        public String getDstName() {
            return this.dstName;
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO setSrcName(String srcName) {
            this.srcName = srcName;
            return this;
        }
        public String getSrcName() {
            return this.srcName;
        }

    }

    public static class ListExchangeUpstreamBindingsResponseBodyDataVoList extends TeaModel {
        @NameInMap("BindingVO")
        public java.util.List<ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO> bindingVO;

        public static ListExchangeUpstreamBindingsResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpstreamBindingsResponseBodyDataVoList self = new ListExchangeUpstreamBindingsResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpstreamBindingsResponseBodyDataVoList setBindingVO(java.util.List<ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO> bindingVO) {
            this.bindingVO = bindingVO;
            return this;
        }
        public java.util.List<ListExchangeUpstreamBindingsResponseBodyDataVoListBindingVO> getBindingVO() {
            return this.bindingVO;
        }

    }

    public static class ListExchangeUpstreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("VoList")
        public ListExchangeUpstreamBindingsResponseBodyDataVoList voList;

        public static ListExchangeUpstreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpstreamBindingsResponseBodyData self = new ListExchangeUpstreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpstreamBindingsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListExchangeUpstreamBindingsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListExchangeUpstreamBindingsResponseBodyData setVoList(ListExchangeUpstreamBindingsResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListExchangeUpstreamBindingsResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
