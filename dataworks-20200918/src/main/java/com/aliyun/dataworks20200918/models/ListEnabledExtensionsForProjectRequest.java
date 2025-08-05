// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionsForProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListEnabledExtensionsForProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionsForProjectRequest self = new ListEnabledExtensionsForProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionsForProjectRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ListEnabledExtensionsForProjectRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ListEnabledExtensionsForProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
