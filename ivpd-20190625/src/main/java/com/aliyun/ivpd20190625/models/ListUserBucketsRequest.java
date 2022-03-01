// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ListUserBucketsRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserBucketsRequestData> data;

    public static ListUserBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserBucketsRequest self = new ListUserBucketsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserBucketsRequest setData(java.util.List<ListUserBucketsRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserBucketsRequestData> getData() {
        return this.data;
    }

    public static class ListUserBucketsRequestData extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        public static ListUserBucketsRequestData build(java.util.Map<String, ?> map) throws Exception {
            ListUserBucketsRequestData self = new ListUserBucketsRequestData();
            return TeaModel.build(map, self);
        }

        public ListUserBucketsRequestData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
