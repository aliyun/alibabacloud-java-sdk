// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectAvailableRegionResponseBody extends TeaModel {
    @NameInMap("Content")
    public GetMediaConnectAvailableRegionResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>41CB9D4C-4650-5723-BA89-D6824F706ACB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static GetMediaConnectAvailableRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectAvailableRegionResponseBody self = new GetMediaConnectAvailableRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectAvailableRegionResponseBody setContent(GetMediaConnectAvailableRegionResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetMediaConnectAvailableRegionResponseBodyContent getContent() {
        return this.content;
    }

    public GetMediaConnectAvailableRegionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMediaConnectAvailableRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaConnectAvailableRegionResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class GetMediaConnectAvailableRegionResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DefaultRegion")
        public String defaultRegion;

        @NameInMap("RegionList")
        public java.util.List<String> regionList;

        public static GetMediaConnectAvailableRegionResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConnectAvailableRegionResponseBodyContent self = new GetMediaConnectAvailableRegionResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetMediaConnectAvailableRegionResponseBodyContent setDefaultRegion(String defaultRegion) {
            this.defaultRegion = defaultRegion;
            return this;
        }
        public String getDefaultRegion() {
            return this.defaultRegion;
        }

        public GetMediaConnectAvailableRegionResponseBodyContent setRegionList(java.util.List<String> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<String> getRegionList() {
            return this.regionList;
        }

    }

}
