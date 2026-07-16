// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListAWSRegionInfosResponseBody extends TeaModel {
    /**
     * <p>The region information.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListAWSRegionInfosResponseBodyRegions> regions;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAWSRegionInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAWSRegionInfosResponseBody self = new ListAWSRegionInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAWSRegionInfosResponseBody setRegions(java.util.List<ListAWSRegionInfosResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListAWSRegionInfosResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListAWSRegionInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAWSRegionInfosResponseBodyRegions extends TeaModel {
        /**
         * <p>The region code.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-2</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>US East (Ohio)</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAWSRegionInfosResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListAWSRegionInfosResponseBodyRegions self = new ListAWSRegionInfosResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListAWSRegionInfosResponseBodyRegions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAWSRegionInfosResponseBodyRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
