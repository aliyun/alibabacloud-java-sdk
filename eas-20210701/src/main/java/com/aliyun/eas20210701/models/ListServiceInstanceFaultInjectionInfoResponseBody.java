// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstanceFaultInjectionInfoResponseBody extends TeaModel {
    @NameInMap("FaultInfoList")
    public java.util.List<ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList> faultInfoList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListServiceInstanceFaultInjectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceFaultInjectionInfoResponseBody self = new ListServiceInstanceFaultInjectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceFaultInjectionInfoResponseBody setFaultInfoList(java.util.List<ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList> faultInfoList) {
        this.faultInfoList = faultInfoList;
        return this;
    }
    public java.util.List<ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList> getFaultInfoList() {
        return this.faultInfoList;
    }

    public ListServiceInstanceFaultInjectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FaultInjectedSuccess</p>
         */
        @NameInMap("FaultStatus")
        public String faultStatus;

        /**
         * <strong>example:</strong>
         * <p>Network interface not found</p>
         */
        @NameInMap("FaultStatusMessage")
        public String faultStatusMessage;

        public static ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus self = new ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus setFaultStatus(String faultStatus) {
            this.faultStatus = faultStatus;
            return this;
        }
        public String getFaultStatus() {
            return this.faultStatus;
        }

        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus setFaultStatusMessage(String faultStatusMessage) {
            this.faultStatusMessage = faultStatusMessage;
            return this;
        }
        public String getFaultStatusMessage() {
            return this.faultStatusMessage;
        }

    }

    public static class ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;FaultType&quot;: &quot;DiskBurnTask&quot;,
         *   &quot;FaultArgs&quot;: {
         *     &quot;FaultAction&quot;: &quot;burn&quot;,
         *     &quot;Read&quot;: true,
         *     &quot;Write&quot;: true,
         *     &quot;Size&quot;: 100
         *   }
         * }</p>
         */
        @NameInMap("FaultArgs")
        public Object faultArgs;

        @NameInMap("FaultStatus")
        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus faultStatus;

        /**
         * <strong>example:</strong>
         * <p>DiskFillTask</p>
         */
        @NameInMap("FaultType")
        public String faultType;

        public static ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList self = new ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList setFaultArgs(Object faultArgs) {
            this.faultArgs = faultArgs;
            return this;
        }
        public Object getFaultArgs() {
            return this.faultArgs;
        }

        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList setFaultStatus(ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus faultStatus) {
            this.faultStatus = faultStatus;
            return this;
        }
        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus getFaultStatus() {
            return this.faultStatus;
        }

        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoList setFaultType(String faultType) {
            this.faultType = faultType;
            return this;
        }
        public String getFaultType() {
            return this.faultType;
        }

    }

}
