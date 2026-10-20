// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateTableFromAuthorizedOssRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>. The target bucket must have the tag key <code>bailian-datahub-access</code> and tag value <code>read</code> added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yinghuo-ai</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The key of the file to import in the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/273129.html">Object naming</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a0deedbce4a8162b8d66c63ace28330c</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The region ID of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegionId")
    public String ossRegionId;

    /**
     * <p>The update mode. Valid values:</p>
     * <ul>
     * <li>OVERWRITE: overwrites existing data.</li>
     * <li>APPEND: appends data to existing data.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OVERWRITE</p>
     */
    @NameInMap("UpdateMode")
    public String updateMode;

    public static UpdateTableFromAuthorizedOssRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableFromAuthorizedOssRequest self = new UpdateTableFromAuthorizedOssRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableFromAuthorizedOssRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdateTableFromAuthorizedOssRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public UpdateTableFromAuthorizedOssRequest setOssRegionId(String ossRegionId) {
        this.ossRegionId = ossRegionId;
        return this;
    }
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    public UpdateTableFromAuthorizedOssRequest setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public String getUpdateMode() {
        return this.updateMode;
    }

}
