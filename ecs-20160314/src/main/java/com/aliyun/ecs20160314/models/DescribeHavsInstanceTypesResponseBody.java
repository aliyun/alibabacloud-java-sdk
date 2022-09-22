// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeHavsInstanceTypesResponseBody extends TeaModel {
    @NameInMap("DescribeHavsInstanceTypesResponse")
    public DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHavsInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHavsInstanceTypesResponseBody self = new DescribeHavsInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHavsInstanceTypesResponseBody setDescribeHavsInstanceTypesResponse(DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse) {
        this.describeHavsInstanceTypesResponse = describeHavsInstanceTypesResponse;
        return this;
    }
    public DescribeHavsInstanceTypesResponse getDescribeHavsInstanceTypesResponse() {
        return this.describeHavsInstanceTypesResponse;
    }

    public DescribeHavsInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HavsInstanceTypes extends TeaModel {
        @NameInMap("HavsInstanceTypes")
        public java.util.List<String> havsInstanceTypes;

        public static HavsInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            HavsInstanceTypes self = new HavsInstanceTypes();
            return TeaModel.build(map, self);
        }

        public HavsInstanceTypes setHavsInstanceTypes(java.util.List<String> havsInstanceTypes) {
            this.havsInstanceTypes = havsInstanceTypes;
            return this;
        }
        public java.util.List<String> getHavsInstanceTypes() {
            return this.havsInstanceTypes;
        }

    }

    public static class DescribeHavsInstanceTypesResponse extends TeaModel {
        @NameInMap("HavsInstanceTypes")
        public HavsInstanceTypes havsInstanceTypes;

        public static DescribeHavsInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeHavsInstanceTypesResponse self = new DescribeHavsInstanceTypesResponse();
            return TeaModel.build(map, self);
        }

        public DescribeHavsInstanceTypesResponse setHavsInstanceTypes(HavsInstanceTypes havsInstanceTypes) {
            this.havsInstanceTypes = havsInstanceTypes;
            return this;
        }
        public HavsInstanceTypes getHavsInstanceTypes() {
            return this.havsInstanceTypes;
        }

    }

}
