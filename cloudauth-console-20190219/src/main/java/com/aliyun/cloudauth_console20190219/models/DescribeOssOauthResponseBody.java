// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeOssOauthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeOssOauthResponseBodyData data;

    public static DescribeOssOauthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssOauthResponseBody self = new DescribeOssOauthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssOauthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssOauthResponseBody setData(DescribeOssOauthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOssOauthResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeOssOauthResponseBodyData extends TeaModel {
        @NameInMap("OssServe")
        public Boolean ossServe;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("OpenOssService")
        public Boolean openOssService;

        @NameInMap("OssAuthorized")
        public Boolean ossAuthorized;

        @NameInMap("OpenOssTime")
        public Long openOssTime;

        public static DescribeOssOauthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssOauthResponseBodyData self = new DescribeOssOauthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOssOauthResponseBodyData setOssServe(Boolean ossServe) {
            this.ossServe = ossServe;
            return this;
        }
        public Boolean getOssServe() {
            return this.ossServe;
        }

        public DescribeOssOauthResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssOauthResponseBodyData setOpenOssService(Boolean openOssService) {
            this.openOssService = openOssService;
            return this;
        }
        public Boolean getOpenOssService() {
            return this.openOssService;
        }

        public DescribeOssOauthResponseBodyData setOssAuthorized(Boolean ossAuthorized) {
            this.ossAuthorized = ossAuthorized;
            return this;
        }
        public Boolean getOssAuthorized() {
            return this.ossAuthorized;
        }

        public DescribeOssOauthResponseBodyData setOpenOssTime(Long openOssTime) {
            this.openOssTime = openOssTime;
            return this;
        }
        public Long getOpenOssTime() {
            return this.openOssTime;
        }

    }

}
