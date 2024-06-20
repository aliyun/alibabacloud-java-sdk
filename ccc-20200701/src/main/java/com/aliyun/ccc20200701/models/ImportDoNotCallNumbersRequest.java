// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportDoNotCallNumbersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>temp/blacklist/import/15772471154xxxx/ccc-test/20220315100340/blacklist.xlsx</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;1900000****&quot;,&quot;1312121****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    @NameInMap("Remark")
    public String remark;

    public static ImportDoNotCallNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDoNotCallNumbersRequest self = new ImportDoNotCallNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ImportDoNotCallNumbersRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ImportDoNotCallNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDoNotCallNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public ImportDoNotCallNumbersRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
