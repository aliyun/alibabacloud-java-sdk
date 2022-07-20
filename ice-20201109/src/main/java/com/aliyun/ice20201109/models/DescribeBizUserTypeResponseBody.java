// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeBizUserTypeResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBizUserTypeResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBizUserTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizUserTypeResponseBody self = new DescribeBizUserTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizUserTypeResponseBody setData(java.util.List<DescribeBizUserTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBizUserTypeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBizUserTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBizUserTypeResponseBodyData extends TeaModel {
        @NameInMap("Profile")
        public String profile;

        public static DescribeBizUserTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizUserTypeResponseBodyData self = new DescribeBizUserTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBizUserTypeResponseBodyData setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

}
