// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventNameListResponseBody extends TeaModel {
    @NameInMap("EventNameList")
    public java.util.List<DescribeInvadeEventNameListResponseBodyEventNameList> eventNameList;

    @NameInMap("NameList")
    public java.util.List<String> nameList;

    /**
     * <strong>example:</strong>
     * <p>6ABAA264-E7B5-5D66-8FC3-9253100****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvadeEventNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventNameListResponseBody self = new DescribeInvadeEventNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventNameListResponseBody setEventNameList(java.util.List<DescribeInvadeEventNameListResponseBodyEventNameList> eventNameList) {
        this.eventNameList = eventNameList;
        return this;
    }
    public java.util.List<DescribeInvadeEventNameListResponseBodyEventNameList> getEventNameList() {
        return this.eventNameList;
    }

    public DescribeInvadeEventNameListResponseBody setNameList(java.util.List<String> nameList) {
        this.nameList = nameList;
        return this;
    }
    public java.util.List<String> getNameList() {
        return this.nameList;
    }

    public DescribeInvadeEventNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvadeEventNameListResponseBodyEventNameList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CActivity</p>
         */
        @NameInMap("EventKey")
        public String eventKey;

        @NameInMap("EventName")
        public String eventName;

        public static DescribeInvadeEventNameListResponseBodyEventNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventNameListResponseBodyEventNameList self = new DescribeInvadeEventNameListResponseBodyEventNameList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventNameListResponseBodyEventNameList setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public DescribeInvadeEventNameListResponseBodyEventNameList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

    }

}
