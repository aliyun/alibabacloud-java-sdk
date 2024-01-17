// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAvailableVipsResponseBody extends TeaModel {
    @NameInMap("AvailableVips")
    public DescribeAvailableVipsResponseBodyAvailableVips availableVips;

    public static DescribeAvailableVipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableVipsResponseBody self = new DescribeAvailableVipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableVipsResponseBody setAvailableVips(DescribeAvailableVipsResponseBodyAvailableVips availableVips) {
        this.availableVips = availableVips;
        return this;
    }
    public DescribeAvailableVipsResponseBodyAvailableVips getAvailableVips() {
        return this.availableVips;
    }

    public static class DescribeAvailableVipsResponseBodyAvailableVips extends TeaModel {
        @NameInMap("AvailableVip")
        public java.util.List<String> availableVip;

        public static DescribeAvailableVipsResponseBodyAvailableVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableVipsResponseBodyAvailableVips self = new DescribeAvailableVipsResponseBodyAvailableVips();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableVipsResponseBodyAvailableVips setAvailableVip(java.util.List<String> availableVip) {
            this.availableVip = availableVip;
            return this;
        }
        public java.util.List<String> getAvailableVip() {
            return this.availableVip;
        }

    }

}
