// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageAdvanceRequest extends TeaModel {
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
    public java.util.List<ScanImageAdvanceRequestTask> task;

    public static ScanImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanImageAdvanceRequest self = new ScanImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScanImageAdvanceRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public ScanImageAdvanceRequest setTask(java.util.List<ScanImageAdvanceRequestTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<ScanImageAdvanceRequestTask> getTask() {
        return this.task;
    }

    public static class ScanImageAdvanceRequestTask extends TeaModel {
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
        public java.io.InputStream imageURLObject;

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

        public static ScanImageAdvanceRequestTask build(java.util.Map<String, ?> map) throws Exception {
            ScanImageAdvanceRequestTask self = new ScanImageAdvanceRequestTask();
            return TeaModel.build(map, self);
        }

        public ScanImageAdvanceRequestTask setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ScanImageAdvanceRequestTask setImageTimeMillisecond(Long imageTimeMillisecond) {
            this.imageTimeMillisecond = imageTimeMillisecond;
            return this;
        }
        public Long getImageTimeMillisecond() {
            return this.imageTimeMillisecond;
        }

        public ScanImageAdvanceRequestTask setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

        public ScanImageAdvanceRequestTask setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ScanImageAdvanceRequestTask setMaxFrames(Integer maxFrames) {
            this.maxFrames = maxFrames;
            return this;
        }
        public Integer getMaxFrames() {
            return this.maxFrames;
        }

    }

}
