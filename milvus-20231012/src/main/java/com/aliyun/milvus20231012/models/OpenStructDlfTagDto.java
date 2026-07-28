// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class OpenStructDlfTagDto extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("snapshotId")
    public Long snapshotId;

    /**
     * <strong>example:</strong>
     * <p>milvus-auto-20260101</p>
     */
    @NameInMap("tagName")
    public String tagName;

    /**
     * <strong>example:</strong>
     * <p>1711334400000</p>
     */
    @NameInMap("timeMillis")
    public Long timeMillis;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("totalRecordCount")
    public Long totalRecordCount;

    public static OpenStructDlfTagDto build(java.util.Map<String, ?> map) throws Exception {
        OpenStructDlfTagDto self = new OpenStructDlfTagDto();
        return TeaModel.build(map, self);
    }

    public OpenStructDlfTagDto setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    public OpenStructDlfTagDto setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public OpenStructDlfTagDto setTimeMillis(Long timeMillis) {
        this.timeMillis = timeMillis;
        return this;
    }
    public Long getTimeMillis() {
        return this.timeMillis;
    }

    public OpenStructDlfTagDto setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

}
