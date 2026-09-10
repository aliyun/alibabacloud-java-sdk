// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableVscsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of available VSC resources.</p>
     */
    @NameInMap("Vscs")
    public java.util.List<ListKVCacheStoreAvailableVscsResponseBodyVscs> vscs;

    public static ListKVCacheStoreAvailableVscsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableVscsResponseBody self = new ListKVCacheStoreAvailableVscsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableVscsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKVCacheStoreAvailableVscsResponseBody setVscs(java.util.List<ListKVCacheStoreAvailableVscsResponseBodyVscs> vscs) {
        this.vscs = vscs;
        return this;
    }
    public java.util.List<ListKVCacheStoreAvailableVscsResponseBodyVscs> getVscs() {
        return this.vscs;
    }

    public static class ListKVCacheStoreAvailableVscsResponseBodyVscs extends TeaModel {
        /**
         * <p>The ID of the VSC device.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-xxxxx</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <p>The current status of the VSC device.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("VscStatus")
        public String vscStatus;

        public static ListKVCacheStoreAvailableVscsResponseBodyVscs build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoreAvailableVscsResponseBodyVscs self = new ListKVCacheStoreAvailableVscsResponseBodyVscs();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoreAvailableVscsResponseBodyVscs setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public ListKVCacheStoreAvailableVscsResponseBodyVscs setVscStatus(String vscStatus) {
            this.vscStatus = vscStatus;
            return this;
        }
        public String getVscStatus() {
            return this.vscStatus;
        }

    }

}
