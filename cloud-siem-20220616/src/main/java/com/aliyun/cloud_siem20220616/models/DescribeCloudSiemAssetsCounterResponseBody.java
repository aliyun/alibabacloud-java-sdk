// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsCounterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeCloudSiemAssetsCounterResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudSiemAssetsCounterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsCounterResponseBody self = new DescribeCloudSiemAssetsCounterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsCounterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemAssetsCounterResponseBody setData(java.util.List<DescribeCloudSiemAssetsCounterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCloudSiemAssetsCounterResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCloudSiemAssetsCounterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemAssetsCounterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemAssetsCounterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemAssetsCounterResponseBodyData extends TeaModel {
        @NameInMap("AssetNum")
        public Integer assetNum;

        @NameInMap("AssetType")
        public String assetType;

        public static DescribeCloudSiemAssetsCounterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemAssetsCounterResponseBodyData self = new DescribeCloudSiemAssetsCounterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemAssetsCounterResponseBodyData setAssetNum(Integer assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Integer getAssetNum() {
            return this.assetNum;
        }

        public DescribeCloudSiemAssetsCounterResponseBodyData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

    }

}
