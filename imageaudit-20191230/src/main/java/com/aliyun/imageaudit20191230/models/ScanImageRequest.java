// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageRequest extends TeaModel {
    /**
     * <p>1</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>porn</p>
     */
    @NameInMap("Scene")
    public java.util.List<String> scene;

    /**
     * <p>1</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Task")
    public java.util.List<ScanImageRequestTask> task;

    public static ScanImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanImageRequest self = new ScanImageRequest();
        return TeaModel.build(map, self);
    }

    public ScanImageRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public ScanImageRequest setTask(java.util.List<ScanImageRequestTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<ScanImageRequestTask> getTask() {
        return this.task;
    }

    public static class ScanImageRequestTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>uuid-xxxx-xxxx-1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageTimeMillisecond")
        public Long imageTimeMillisecond;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.xxx.com/xxx.jpg">http://xxx.xxx.com/xxx.jpg</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxFrames")
        public Integer maxFrames;

        public static ScanImageRequestTask build(java.util.Map<String, ?> map) throws Exception {
            ScanImageRequestTask self = new ScanImageRequestTask();
            return TeaModel.build(map, self);
        }

        public ScanImageRequestTask setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ScanImageRequestTask setImageTimeMillisecond(Long imageTimeMillisecond) {
            this.imageTimeMillisecond = imageTimeMillisecond;
            return this;
        }
        public Long getImageTimeMillisecond() {
            return this.imageTimeMillisecond;
        }

        public ScanImageRequestTask setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ScanImageRequestTask setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ScanImageRequestTask setMaxFrames(Integer maxFrames) {
            this.maxFrames = maxFrames;
            return this;
        }
        public Integer getMaxFrames() {
            return this.maxFrames;
        }

    }

}
