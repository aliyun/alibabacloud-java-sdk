// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DictInfo extends TeaModel {
    /**
     * <p>The size of the dictionary file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2782602</p>
     */
    @NameInMap("fileSize")
    public Long fileSize;

    /**
     * <p>The name of the dictionary file. Requirements:</p>
     * <ul>
     * <li>Main dictionary or stopword list: one word per line, saved as a UTF-8 encoded DIC file. The file name can contain uppercase and lowercase letters, digits, and underscores, and cannot exceed 30 characters in length. Files with duplicate names are not allowed. The main dictionary file and the stopword file cannot share the same name.</li>
     * <li>Synonym dictionary: one synonym expression per line, saved as a UTF-8 encoded TXT file.</li>
     * <li>Alibaba dictionary: the file name must be aliws_ext_dict.txt. The file must be in UTF-8 format. Each line contains one word with no leading or trailing whitespace. Use UNIX or Linux line endings, where each line ends with 
     * . If the file is generated on a Windows system, use the dos2unix tool on a Linux machine to process the dictionary file before uploading it.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliws_ext_dict.txt</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source type of the dictionary file. Valid values:</p>
     * <ul>
     * <li>OSS: Object Storage Service (OSS). Ensure that the OSS bucket has public-read permission.</li>
     * <li>ORIGIN: open-source Elasticsearch</li>
     * <li>UPLOAD: uploaded file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The type of the dictionary file. Valid values:</p>
     * <ul>
     * <li>STOP: stopword list</li>
     * <li>MAIN: main dictionary</li>
     * <li>SYNONYMS: synonym dictionary</li>
     * <li>ALI_WS: Alibaba dictionary.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALI_WS</p>
     */
    @NameInMap("type")
    public String type;

    public static DictInfo build(java.util.Map<String, ?> map) throws Exception {
        DictInfo self = new DictInfo();
        return TeaModel.build(map, self);
    }

    public DictInfo setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DictInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DictInfo setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DictInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
