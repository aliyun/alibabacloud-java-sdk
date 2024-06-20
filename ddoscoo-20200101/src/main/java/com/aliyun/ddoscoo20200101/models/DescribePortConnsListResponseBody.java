// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the connections established over the port.</p>
     */
    @NameInMap("ConnsList")
    public java.util.List<DescribePortConnsListResponseBodyConnsList> connsList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6D48AED0-41DB-5D9B-B484-3B6AAD312AD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortConnsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsListResponseBody self = new DescribePortConnsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsListResponseBody setConnsList(java.util.List<DescribePortConnsListResponseBodyConnsList> connsList) {
        this.connsList = connsList;
        return this;
    }
    public java.util.List<DescribePortConnsListResponseBodyConnsList> getConnsList() {
        return this.connsList;
    }

    public DescribePortConnsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortConnsListResponseBodyConnsList extends TeaModel {
        /**
         * <p>The number of active connections.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ActConns")
        public Long actConns;

        /**
         * <p>The number of concurrent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Conns")
        public Long conns;

        /**
         * <p>The new connection creation rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <p>The number of inactive connections.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InActConns")
        public Long inActConns;

        /**
         * <p>The index number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>16506</p>
         */
        @NameInMap("Index")
        public Long index;

        public static DescribePortConnsListResponseBodyConnsList build(java.util.Map<String, ?> map) throws Exception {
            DescribePortConnsListResponseBodyConnsList self = new DescribePortConnsListResponseBodyConnsList();
            return TeaModel.build(map, self);
        }

        public DescribePortConnsListResponseBodyConnsList setActConns(Long actConns) {
            this.actConns = actConns;
            return this;
        }
        public Long getActConns() {
            return this.actConns;
        }

        public DescribePortConnsListResponseBodyConnsList setConns(Long conns) {
            this.conns = conns;
            return this;
        }
        public Long getConns() {
            return this.conns;
        }

        public DescribePortConnsListResponseBodyConnsList setCps(Long cps) {
            this.cps = cps;
            return this;
        }
        public Long getCps() {
            return this.cps;
        }

        public DescribePortConnsListResponseBodyConnsList setInActConns(Long inActConns) {
            this.inActConns = inActConns;
            return this;
        }
        public Long getInActConns() {
            return this.inActConns;
        }

        public DescribePortConnsListResponseBodyConnsList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

}
