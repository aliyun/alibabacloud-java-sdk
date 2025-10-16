// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterPodLabelsResponseBody extends TeaModel {
    @NameInMap("AckLabels")
    public java.util.List<DescribeAckClusterPodLabelsResponseBodyAckLabels> ackLabels;

    /**
     * <strong>example:</strong>
     * <p>6169C0A4-B91A-5D48-AE4D-B9432D15****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAckClusterPodLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterPodLabelsResponseBody self = new DescribeAckClusterPodLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterPodLabelsResponseBody setAckLabels(java.util.List<DescribeAckClusterPodLabelsResponseBodyAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<DescribeAckClusterPodLabelsResponseBodyAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public DescribeAckClusterPodLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAckClusterPodLabelsResponseBodyAckLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAckClusterPodLabelsResponseBodyAckLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAckClusterPodLabelsResponseBodyAckLabels self = new DescribeAckClusterPodLabelsResponseBodyAckLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAckClusterPodLabelsResponseBodyAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAckClusterPodLabelsResponseBodyAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
