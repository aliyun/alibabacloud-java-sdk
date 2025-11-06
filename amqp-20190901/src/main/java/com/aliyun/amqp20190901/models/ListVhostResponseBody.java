// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListVhostResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListVhostResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListVhostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVhostResponseBody self = new ListVhostResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVhostResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVhostResponseBody setData(ListVhostResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVhostResponseBodyData getData() {
        return this.data;
    }

    public ListVhostResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVhostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVhostResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVhostResponseBodyDataVhosts extends TeaModel {
        @NameInMap("ChannelNum")
        public Integer channelNum;

        @NameInMap("ConnectionNum")
        public Integer connectionNum;

        @NameInMap("Name")
        public String name;

        public static ListVhostResponseBodyDataVhosts build(java.util.Map<String, ?> map) throws Exception {
            ListVhostResponseBodyDataVhosts self = new ListVhostResponseBodyDataVhosts();
            return TeaModel.build(map, self);
        }

        public ListVhostResponseBodyDataVhosts setChannelNum(Integer channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Integer getChannelNum() {
            return this.channelNum;
        }

        public ListVhostResponseBodyDataVhosts setConnectionNum(Integer connectionNum) {
            this.connectionNum = connectionNum;
            return this;
        }
        public Integer getConnectionNum() {
            return this.connectionNum;
        }

        public ListVhostResponseBodyDataVhosts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListVhostResponseBodyData extends TeaModel {
        @NameInMap("Vhosts")
        public java.util.List<ListVhostResponseBodyDataVhosts> vhosts;

        public static ListVhostResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVhostResponseBodyData self = new ListVhostResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVhostResponseBodyData setVhosts(java.util.List<ListVhostResponseBodyDataVhosts> vhosts) {
            this.vhosts = vhosts;
            return this;
        }
        public java.util.List<ListVhostResponseBodyDataVhosts> getVhosts() {
            return this.vhosts;
        }

    }

}
