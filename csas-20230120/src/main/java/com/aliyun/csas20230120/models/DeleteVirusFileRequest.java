// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVirusFileRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user\&quot;s endpoint device where the virus file is located. The value can be up to 64 characters in length. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The MD5 value of the virus file. The value must be a 32-character hexadecimal string. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The full path of the virus file on the user\&quot;s endpoint device. Only records with a handling action of Fail can be deleted. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Users\Public\Downloads\setup.exe</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static DeleteVirusFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirusFileRequest self = new DeleteVirusFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirusFileRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public DeleteVirusFileRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public DeleteVirusFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
