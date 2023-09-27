// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitGeneralContractExtractJobAdvanceRequest extends TeaModel {
    @NameInMap("ContractModel")
    public String contractModel;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    public static SubmitGeneralContractExtractJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitGeneralContractExtractJobAdvanceRequest self = new SubmitGeneralContractExtractJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitGeneralContractExtractJobAdvanceRequest setContractModel(String contractModel) {
        this.contractModel = contractModel;
        return this;
    }
    public String getContractModel() {
        return this.contractModel;
    }

    public SubmitGeneralContractExtractJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitGeneralContractExtractJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitGeneralContractExtractJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

}
