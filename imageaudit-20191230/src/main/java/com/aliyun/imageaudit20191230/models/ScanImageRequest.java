// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageRequest extends TeaModel {
    @NameInMap("Task")
    public java.util.List<ScanImageRequestTask> task;

    @NameInMap("Scene")
    public java.util.List<String> scene;

    public static ScanImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanImageRequest self = new ScanImageRequest();
        return TeaModel.build(map, self);
    }

    public ScanImageRequest setTask(java.util.List<ScanImageRequestTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<ScanImageRequestTask> getTask() {
        return this.task;
    }

    public ScanImageRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public static class ScanImageRequestTask extends TeaModel {
        @NameInMap("ImageTimeMillisecond")
        public Long imageTimeMillisecond;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("MaxFrames")
        public Integer maxFrames;

        @NameInMap("DataId")
        public String dataId;

        public static ScanImageRequestTask build(java.util.Map<String, ?> map) throws Exception {
            ScanImageRequestTask self = new ScanImageRequestTask();
            return TeaModel.build(map, self);
        }

        public ScanImageRequestTask setImageTimeMillisecond(Long imageTimeMillisecond) {
            this.imageTimeMillisecond = imageTimeMillisecond;
            return this;
        }
        public Long getImageTimeMillisecond() {
            return this.imageTimeMillisecond;
        }

        public ScanImageRequestTask setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ScanImageRequestTask setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ScanImageRequestTask setMaxFrames(Integer maxFrames) {
            this.maxFrames = maxFrames;
            return this;
        }
        public Integer getMaxFrames() {
            return this.maxFrames;
        }

        public ScanImageRequestTask setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
