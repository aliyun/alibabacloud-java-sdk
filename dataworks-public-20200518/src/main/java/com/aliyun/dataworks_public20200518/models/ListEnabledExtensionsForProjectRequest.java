// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionsForProjectRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console?spm=a2c4g.11186623.0.0.6b4d4941azHd2k) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The type of the code for the file.</p>
     * <br>
     * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
     * <br>
     * <p>You can call the [ListFileType](https://help.aliyun.com/document_detail/212428.html) operation to query the type of the code for the file.</p>
     * <br>
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
