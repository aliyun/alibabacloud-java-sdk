// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SubmitImageRequest extends TeaModel {
    /**
     * <p>The list of destination regions to which the image is copied.</p>
     * 
     * <strong>example:</strong>
     * <p>List</p>
     */
    @NameInMap("DestinationRegionList")
    public java.util.List<String> destinationRegionList;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-be7jzm29wrrz5****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SubmitImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageRequest self = new SubmitImageRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageRequest setDestinationRegionList(java.util.List<String> destinationRegionList) {
        this.destinationRegionList = destinationRegionList;
        return this;
    }
    public java.util.List<String> getDestinationRegionList() {
        return this.destinationRegionList;
    }

    public SubmitImageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
