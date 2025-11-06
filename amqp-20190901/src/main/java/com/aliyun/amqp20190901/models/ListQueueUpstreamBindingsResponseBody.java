// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListQueueUpstreamBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListQueueUpstreamBindingsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQueueUpstreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpstreamBindingsResponseBody self = new ListQueueUpstreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueUpstreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListQueueUpstreamBindingsResponseBody setData(ListQueueUpstreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueUpstreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListQueueUpstreamBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueueUpstreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueueUpstreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO extends TeaModel {
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

        public static ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO self = new ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO();
            return TeaModel.build(map, self);
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO setBindingType(Integer bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public Integer getBindingType() {
            return this.bindingType;
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO setDstName(String dstName) {
            this.dstName = dstName;
            return this;
        }
        public String getDstName() {
            return this.dstName;
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO setSrcName(String srcName) {
            this.srcName = srcName;
            return this;
        }
        public String getSrcName() {
            return this.srcName;
        }

    }

    public static class ListQueueUpstreamBindingsResponseBodyDataVoList extends TeaModel {
        @NameInMap("BindingVO")
        public java.util.List<ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO> bindingVO;

        public static ListQueueUpstreamBindingsResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpstreamBindingsResponseBodyDataVoList self = new ListQueueUpstreamBindingsResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListQueueUpstreamBindingsResponseBodyDataVoList setBindingVO(java.util.List<ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO> bindingVO) {
            this.bindingVO = bindingVO;
            return this;
        }
        public java.util.List<ListQueueUpstreamBindingsResponseBodyDataVoListBindingVO> getBindingVO() {
            return this.bindingVO;
        }

    }

    public static class ListQueueUpstreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("VoList")
        public ListQueueUpstreamBindingsResponseBodyDataVoList voList;

        public static ListQueueUpstreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpstreamBindingsResponseBodyData self = new ListQueueUpstreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueUpstreamBindingsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListQueueUpstreamBindingsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQueueUpstreamBindingsResponseBodyData setVoList(ListQueueUpstreamBindingsResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListQueueUpstreamBindingsResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
