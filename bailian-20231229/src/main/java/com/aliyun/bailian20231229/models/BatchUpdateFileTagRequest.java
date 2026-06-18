// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class BatchUpdateFileTagRequest extends TeaModel {
    /**
     * <p>A list of files to update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileInfos")
    public java.util.List<BatchUpdateFileTagRequestFileInfos> fileInfos;

    /**
     * <p>The update mode. Valid values are APPEND and OVERWRITE.</p>
     * 
     * <strong>example:</strong>
     * <p>OVERWRITE</p>
     */
    @NameInMap("UpdateMode")
    public String updateMode;

    public static BatchUpdateFileTagRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileTagRequest self = new BatchUpdateFileTagRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileTagRequest setFileInfos(java.util.List<BatchUpdateFileTagRequestFileInfos> fileInfos) {
        this.fileInfos = fileInfos;
        return this;
    }
    public java.util.List<BatchUpdateFileTagRequestFileInfos> getFileInfos() {
        return this.fileInfos;
    }

    public BatchUpdateFileTagRequest setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public String getUpdateMode() {
        return this.updateMode;
    }

    public static class BatchUpdateFileTagRequestFileInfos extends TeaModel {
        /**
         * <p>The file ID. To get this ID, go to the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">application data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">application data</a> page and click the ID icon next to the file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file_3d5319366e2c46309f4c11cfbeacd5fd_10045951</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <ul>
         * <li>A list of up to 100 tags to associate with the file. The total length of all tags cannot exceed 700 characters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        public static BatchUpdateFileTagRequestFileInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileTagRequestFileInfos self = new BatchUpdateFileTagRequestFileInfos();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileTagRequestFileInfos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public BatchUpdateFileTagRequestFileInfos setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
