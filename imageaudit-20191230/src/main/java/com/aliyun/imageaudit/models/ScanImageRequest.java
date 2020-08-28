// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit.models;

import com.aliyun.tea.*;

public class ScanImageRequest extends TeaModel {
    @NameInMap("Task")
    @Validation(required = true)
    public java.util.List<ScanImageRequestTask> task;

    @NameInMap("Scene")
    @Validation(required = true)
    public java.util.List<String> scene;

    public static ScanImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanImageRequest self = new ScanImageRequest();
        return TeaModel.build(map, self);
    }

    public static class ScanImageRequestTask extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("ImageTimeMillisecond")
        public Long imageTimeMillisecond;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("MaxFrames")
        public Integer maxFrames;

        public static ScanImageRequestTask build(java.util.Map<String, ?> map) throws Exception {
            ScanImageRequestTask self = new ScanImageRequestTask();
            return TeaModel.build(map, self);
        }

    }

}
