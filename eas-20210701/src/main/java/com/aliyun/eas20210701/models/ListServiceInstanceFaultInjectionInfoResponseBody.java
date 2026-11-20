// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstanceFaultInjectionInfoResponseBody extends TeaModel {
    /**
     * <p>The list of injected faults.</p>
     */
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
         * <p>The fault status. Valid values:</p>
         * <ul>
         * <li>FaultNotInjected: The task is created but the fault is not injected.</li>
         * <li>FaultInjectedSuccess: The fault is successfully injected.</li>
         * <li>FaultInjectedFailure: The fault injection failed, which may be caused by parameter errors or system issues.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FaultInjectedSuccess</p>
         */
        @NameInMap("FaultStatus")
        public String faultStatus;

        /**
         * <p>The description of the fault injection.</p>
         * 
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
         * <p>Detailed parameters for each fault type:</p>
         * <ol>
         * <li>CpuFullloadTask (CPU full load fault)
         * <code>{   &quot;FaultType&quot;: &quot;CpuFullloadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fullload&quot;,  &quot;CpuPercent&quot;: 50   } }</code></li>
         * <li>MemLoadTask (memory load fault)
         * <code>{   &quot;FaultType&quot;: &quot;MemLoadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;load&quot;,  &quot;MemPercent&quot;: 80   } }</code></li>
         * <li>NetworkTask (network fault)
         * 3.a. NetworkDelayAction (network delay)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;delay&quot;,  &quot;Time&quot;: 3000,  &quot;Offset&quot;: 100   } }</code>
         * 3.b. NetworkCorruptAction (network packet corruption)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;corrupt&quot;,  &quot;Percent&quot;: 50   } }</code>
         * 3.c. NetworkLossAction (network packet loss)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;loss&quot;,  &quot;Percent&quot;: 30   } }</code></li>
         * <li>DiskBurnTask (disk read/write fault)
         * <code>{   &quot;FaultType&quot;: &quot;DiskBurnTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;burn&quot;,  &quot;Read&quot;: true,  &quot;Write&quot;: true,  &quot;Size&quot;: 100   } }</code></li>
         * <li>DiskFillTask (disk fill fault)
         * <code>{   &quot;FaultType&quot;: &quot;DiskFillTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fill&quot;,  &quot;Percent&quot;: 80   } }</code></li>
         * </ol>
         * 
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

        /**
         * <p>The fault status.</p>
         */
        @NameInMap("FaultStatus")
        public ListServiceInstanceFaultInjectionInfoResponseBodyFaultInfoListFaultStatus faultStatus;

        /**
         * <p>The fault type. Valid values:</p>
         * <ul>
         * <li>CpuFullloadTask: CPU full load fault.</li>
         * <li>MemLoadTask: memory load fault.</li>
         * <li>NetworkTask: network fault.</li>
         * <li>DiskBurnTask: disk read/write fault.</li>
         * <li>DiskFillTask: disk fill fault.</li>
         * </ul>
         * 
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
