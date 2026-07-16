// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the files are imported. This is the <code>CategoryId</code> returned by the AddCategory operation. You can also obtain the category ID by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab. You can pass in <code>default</code> to use the system-created default category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The category type. Optional. Default value: UNSTRUCTURED. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: category for building knowledge base scenarios.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This operation does not support importing SESSION_FILE for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">conversation interaction</a>. Use the <strong>AddFile</strong> operation to upload SESSION_FILE from a local source.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The list of files to import. A maximum of 10 files can be uploaded at a time.</p>
     * <blockquote>
     * <p>A maximum of 10 files can be uploaded at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileDetails")
    public String fileDetailsShrink;

    /**
     * <p>The name of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketNamexxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

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
     * <p>Specifies whether to overwrite files with the same OssKey in the category. Default value: false, which means files are not overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverWriteFileByOssKey")
    public Boolean overWriteFileByOssKey;

    /**
     * <p>The list of tags associated with the file. Default value: empty, which means the file is not associated with any tags. A maximum of 10 tags can be specified.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static AddFilesFromAuthorizedOssShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilesFromAuthorizedOssShrinkRequest self = new AddFilesFromAuthorizedOssShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddFilesFromAuthorizedOssShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setFileDetailsShrink(String fileDetailsShrink) {
        this.fileDetailsShrink = fileDetailsShrink;
        return this;
    }
    public String getFileDetailsShrink() {
        return this.fileDetailsShrink;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setOssRegionId(String ossRegionId) {
        this.ossRegionId = ossRegionId;
        return this;
    }
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setOverWriteFileByOssKey(Boolean overWriteFileByOssKey) {
        this.overWriteFileByOssKey = overWriteFileByOssKey;
        return this;
    }
    public Boolean getOverWriteFileByOssKey() {
        return this.overWriteFileByOssKey;
    }

    public AddFilesFromAuthorizedOssShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
