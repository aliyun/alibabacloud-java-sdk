// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendValidateFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressColumn")
    public Integer addressColumn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx.oss-xxx.com/file.txt">http://xxxx.oss-xxx.com/file.txt</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasHeaderRow")
    public Boolean hasHeaderRow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveDuplicate")
    public Boolean removeDuplicate;

    public static SendValidateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SendValidateFileRequest self = new SendValidateFileRequest();
        return TeaModel.build(map, self);
    }

    public SendValidateFileRequest setAddressColumn(Integer addressColumn) {
        this.addressColumn = addressColumn;
        return this;
    }
    public Integer getAddressColumn() {
        return this.addressColumn;
    }

    public SendValidateFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SendValidateFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SendValidateFileRequest setHasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
        return this;
    }
    public Boolean getHasHeaderRow() {
        return this.hasHeaderRow;
    }

    public SendValidateFileRequest setRemoveDuplicate(Boolean removeDuplicate) {
        this.removeDuplicate = removeDuplicate;
        return this;
    }
    public Boolean getRemoveDuplicate() {
        return this.removeDuplicate;
    }

}
