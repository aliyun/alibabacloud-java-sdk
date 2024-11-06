// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLogContentsRequest extends TeaModel {
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListLogContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogContentsRequest self = new ListLogContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogContentsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListLogContentsRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ListLogContentsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListLogContentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
