// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListEntriesResponseBody extends TeaModel {
    /**
     * <p>Port list entries.</p>
     */
    @NameInMap("Entries")
    public java.util.List<DescribePortRangeListEntriesResponseBodyEntries> entries;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>882304EC-5CE2-5860-98ED-3FA1D8D74A0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortRangeListEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListEntriesResponseBody self = new DescribePortRangeListEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListEntriesResponseBody setEntries(java.util.List<DescribePortRangeListEntriesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<DescribePortRangeListEntriesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public DescribePortRangeListEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortRangeListEntriesResponseBodyEntries extends TeaModel {
        /**
         * <p>The description of the port range.</p>
         * 
         * <strong>example:</strong>
         * <p>Description information of PortRangeList</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        public static DescribePortRangeListEntriesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRangeListEntriesResponseBodyEntries self = new DescribePortRangeListEntriesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribePortRangeListEntriesResponseBodyEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePortRangeListEntriesResponseBodyEntries setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

    }

}
