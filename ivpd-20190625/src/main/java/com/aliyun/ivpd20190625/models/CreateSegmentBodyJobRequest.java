// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class CreateSegmentBodyJobRequest extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<CreateSegmentBodyJobRequestDataList> dataList;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TimeToLive")
    public Integer timeToLive;

    public static CreateSegmentBodyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSegmentBodyJobRequest self = new CreateSegmentBodyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSegmentBodyJobRequest setDataList(java.util.List<CreateSegmentBodyJobRequestDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<CreateSegmentBodyJobRequestDataList> getDataList() {
        return this.dataList;
    }

    public CreateSegmentBodyJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateSegmentBodyJobRequest setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }
    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    public static class CreateSegmentBodyJobRequestDataList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        public static CreateSegmentBodyJobRequestDataList build(java.util.Map<String, ?> map) throws Exception {
            CreateSegmentBodyJobRequestDataList self = new CreateSegmentBodyJobRequestDataList();
            return TeaModel.build(map, self);
        }

        public CreateSegmentBodyJobRequestDataList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CreateSegmentBodyJobRequestDataList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
